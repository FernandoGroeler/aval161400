package br.univel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.univel.bancodados.Conexao;
import br.univel.entidade.Aluno;

public class AlunoDao {
	private static final String SQL_BUSCAR_TODOS = "SELECT * FROM ALUNO";
	private static final String SQL_INSERIR = "INSERT INTO ALUNO (NOME, IDADE, CURSO) VALUES (?, ?, ?)";
	private static final String SQL_EXCLUIR = "DELETE FROM ALUNO WHERE ID = ?";
	private static final String SQL_ATUALIZAR = "UPDATE ALUNO SET NOME = ?, IDADE = ?, CURSO = ? WHERE ID = ?";	
	
	public List<Aluno> getTodos() {
		Connection con = Conexao.getInstance().getCon();
		
		List<Aluno> lista = new ArrayList<>();

		try {
			PreparedStatement ps = con.prepareStatement(SQL_BUSCAR_TODOS);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Aluno a = new Aluno();
				a.setId(rs.getInt(1));
				a.setNome(rs.getString(2));
				a.setIdade(rs.getInt(3));
				a.setCurso(rs.getString(4));

				lista.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public void inserir(Aluno a) {
		Connection con = Conexao.getInstance().getCon();
		
		try {
			PreparedStatement ps = con.prepareStatement(SQL_INSERIR);
			ps.setString(1, a.getNome());
			ps.setInt(2, a.getIdade());
			ps.setString(3, a.getCurso());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	
	public void excluir(Aluno a) {
		Connection con = Conexao.getInstance().getCon();
		
		try {
			PreparedStatement ps = con.prepareStatement(SQL_EXCLUIR);
			ps.setLong(1, a.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Aluno a) {
		Connection con = Conexao.getInstance().getCon();
		
		try {
			PreparedStatement ps = con.prepareStatement(SQL_ATUALIZAR);
			ps.setString(1, a.getNome());
			ps.setInt(2, a.getIdade());
			ps.setString(3, a.getCurso());
			ps.setLong(4, a.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}