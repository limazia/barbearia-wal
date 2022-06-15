/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import Model.Servico;
import Model.Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mrcsa
 */
public class AgendamentoConexao {
    
    Connection conexão;
    
    public AgendamentoConexao(Connection conexão){
        this.conexão = conexão;
    }
    
    public void agendar(Agendamento a){
        String sql = "insert into agendamento(cliente, tipoServico, dia, hora, profissional, observacao) values(?,?,?,?,?,?)";
        PreparedStatement ps;
        
        try{
            ps = this.conexão.prepareStatement(sql);
            ps.setString(1, a.getCliente());
            ps.setString(5, a.getProfissional());
            ps.setString(3, a.getData());
            ps.setString(4, a.getHora());
            ps.setString(2, a.getServico());
            ps.setString(6, a.getObservacao());
            ps.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Agendamento> listar(){
        ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();
        String sql = "SELECT * FROM agendamento";
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            while(resposta.next()){
                String a = resposta.getString("cliente");
                String b = resposta.getString("tipoServico");
                String c = resposta.getString("profissional");
                String d = resposta.getString("hora");
                String e = resposta.getString("dia");
                String f = resposta.getString("observacao");
                        
                
                Agendamento ag = new Agendamento(a,b,c,d,e,f);
                agendamentos.add(ag);            
            }
        } catch(SQLException e){
            e.printStackTrace();  
        }
        
        return agendamentos;
    }
    
}
