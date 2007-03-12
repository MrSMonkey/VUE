/*
 * Ontology.java
 *
 * Created on March 12, 2007, 3:08 PM
 *
 * <p><b>License and Copyright: </b>The contents of this file are subject to the
 * Mozilla Public License Version 1.1 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License
 * at <a href="http://www.mozilla.org/MPL">http://www.mozilla.org/MPL/.</a></p>
 *
 * <p>Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.</p>
 *
 * <p>The entire file consists of original code.  Copyright &copy; 2003-2007
 * Tufts University. All rights reserved.</p>
 *
 * -----------------------------------------------------------------------------
 */

/**
 *
 * @author akumar03
 */

package edu.tufts.vue.ontology;

import edu.tufts.vue.style.*;

import java.util.*;

public class Ontology {
    private List<OntType> types = new ArrayList<OntType>();
    private String base;
    /** Creates a new instance of Ontology */
    public Ontology() {
    }
    public List<OntType> getOntTypes() {
        return this.types;
    }
    public String getBase() {
        return this.base;
    }
    public void setBase(String base) {
        this.base = base;
    }
    public void setOntTypes(List<OntType> types) {
        this.types = types;
    }
    public String toString() {
        String s = new String();
        s = "Base: "+base;
        for(OntType o: types) {
            s += o;
        }
        return s;
    }
}
