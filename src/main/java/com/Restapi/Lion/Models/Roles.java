package com.Restapi.Lion.Models;

import jakarta.persistence.*;


@Entity
@Table(name="roles")
public class Roles {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Enumerated(EnumType.STRING)
		@Column(length =20 )
		private Emode name;
		
		public Roles() {
			
		}
		
		public Roles(int id,Emode name) {
			
			super();
			this.id=id;
			this.name=name;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Emode getName() {
			return name;
		}

		public void setName(Emode name) {
			this.name = name;
		}
		
}
