package br.com.flosnexu.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O Atributo nome é Obrigatorio!")
	@Size(min = 3, max = 255, message = "O Atributo Nome deve ter no minimo 3 e no maximo 50 Caracteres")
	private String nome;

	@NotBlank(message = "O Atributo Descrição é obrigatório")
	@Size(min = 20, max = 1000, message = "O Atributo Nome deve ter no minimo 20 e no maximo 1000 Caracteres")
	private String descricao;

	@NotNull(message = "O atributo preço é Obrigatorio!")
	private Double preco;

	@Size(min = 3, max = 255, message = "O Atributo Nome deve ter no minimo 3 e no maximo 50 Caracteres")
	private String foto;

	@Size(min = 3, max = 255, message = "O Atributo Nome deve ter no minimo 3 e no maximo 50 Caracteres")
	private String marca;

	private int quantidade;

	// Relacionando com tabela categoria
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}