/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

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


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C176"),
    @Field(name = "codModUltE"),
    @Field(name = "numDocUltE"),
    @Field(name = "serUltE"),
    @Field(name = "dtUltE"),
    @Field(name = "codPartUltE"),
    @Field(name = "quantUltE"),
    @Field(name = "vlUnitUltE"),
    @Field(name = "vlUnitBcSt")
})
public class RegC176 {

    private String codModUltE;
    private Long numDocUltE;
    private String serUltE;
    private Date dtUltE;
    private String codPartUltE;
    private Double quantUltE;
    private Double vlUnitUltE;
    private Double vlUnitBcSt;

    public String getCodModUltE() {
        return codModUltE;
    }

    public void setCodModUltE(String codModUltE) {
        this.codModUltE = codModUltE;
    }

    public Long getNumDocUltE() {
        return numDocUltE;
    }

    public void setNumDocUltE(Long numDocUltE) {
        this.numDocUltE = numDocUltE;
    }

    public String getSerUltE() {
        return serUltE;
    }

    public void setSerUltE(String serUltE) {
        this.serUltE = serUltE;
    }

    public Date getDtUltE() {
        return dtUltE;
    }

    public void setDtUltE(Date dtUltE) {
        this.dtUltE = dtUltE;
    }

    public String getCodPartUltE() {
        return codPartUltE;
    }

    public void setCodPartUltE(String codPartUltE) {
        this.codPartUltE = codPartUltE;
    }

    public Double getQuantUltE() {
        return quantUltE;
    }

    public void setQuantUltE(Double quantUltE) {
        this.quantUltE = quantUltE;
    }

    public Double getVlUnitUltE() {
        return vlUnitUltE;
    }

    public void setVlUnitUltE(Double vlUnitUltE) {
        this.vlUnitUltE = vlUnitUltE;
    }

    public Double getVlUnitBcSt() {
        return vlUnitBcSt;
    }

    public void setVlUnitBcSt(Double vlUnitBcSt) {
        this.vlUnitBcSt = vlUnitBcSt;
    }
}
