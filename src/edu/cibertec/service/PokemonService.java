package edu.cibertec.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.cibertec.beans.Pokemon;
import edu.cibertec.utils.ConexionMySQL;

public class PokemonService {

	
	public List<Pokemon> listadoPokemon(String name, int offset){
		List<Pokemon> listado = new ArrayList<Pokemon>();
		String sql = "SELECT * FROM TB_POKEMON WHERE NAME LIKE CONCAT(IFNULL(?,NAME),'%') LIMIT 20 OFFSET ?;";	
		
		try {
			Connection conexion = ConexionMySQL.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, offset);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Pokemon p = new Pokemon();
				p.setNumero(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPhotoUrl(rs.getString(3));
				listado.add(p);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listado;
	}
}
