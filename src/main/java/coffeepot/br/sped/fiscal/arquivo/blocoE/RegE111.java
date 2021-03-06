/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoE;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import java.util.List;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.types.AccessorType;
import coffeepot.br.sped.fiscal.tipos.CodigoAjusteApuracaoIcms;

/**
 *
 * @author Mauricio R. Morais
 */
@Record(accessorType = AccessorType.PROPERTY, fields = {
    @Field(name = "reg", id = true, constantValue="E111"),
	@Field(name = "codAjApur"),
	@Field(name = "descrComplAj"),
	@Field(name = "vlAjApur"),
	@Field(name = "regE112List"),
	@Field(name = "regE113List")
})
public class RegE111{
	private CodigoAjusteApuracaoIcms codAjApur;
	private String descrComplAj;
	private Double vlAjApur;
	private List<RegE112> regE112List;
	private List<RegE113> regE113List;
	
	public CodigoAjusteApuracaoIcms getCodAjApur() {
		return codAjApur;
	}
	public void setCodAjApur(CodigoAjusteApuracaoIcms codAjApur) {
		this.codAjApur = codAjApur;
	}
	public String getDescrComplAj() {
		return descrComplAj;
	}
	public void setDescrComplAj(String descrComplAj) {
		this.descrComplAj = descrComplAj;
	}
	public Double getVlAjApur() {
		return vlAjApur;
	}
	public void setVlAjApur(Double vlAjApur) {
		this.vlAjApur = vlAjApur;
	}
	public List<RegE112> getRegE112List() {
		return regE112List;
	}
	public void setRegE112List(List<RegE112> regE112List) {
		this.regE112List = regE112List;
	}
	public List<RegE113> getRegE113List() {
		return regE113List;
	}
	public void setRegE113List(List<RegE113> regE113List) {
		this.regE113List = regE113List;
	}

	
}
