/**
* This software was developed and / or modified by Raytheon Company,
* pursuant to Contract DG133W-05-CQ-1067 with the US Government.
* 
* U.S. EXPORT CONTROLLED TECHNICAL DATA
* This software product contains export-restricted data whose
* export/transfer/disclosure is restricted by U.S. law. Dissemination
* to non-U.S. persons whether in the United States or abroad requires
* an export license or other authorization.
* 
* Contractor Name:        Raytheon Company
* Contractor Address:     6825 Pine Street, Suite 340
*                         Mail Stop B8
*                         Omaha, NE 68106
*                         402.291.0100
* 
* See the AWIPS II Master Rights File ("Master Rights File.pdf") for
* further licensing information.
**/
package com.raytheon.uf.common.dataplugin.shef.tables;
// default package
// Generated Oct 17, 2008 2:22:17 PM by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HwstagesId generated by hbm2java
 * 
 * 
 * <pre>
 * 
 * SOFTWARE HISTORY
 * Date         Ticket#    Engineer    Description
 * ------------ ---------- ----------- --------------------------
 * Oct 17, 2008                        Initial generation by hbm2java
 * Aug 19, 2011      10672     jkorman Move refactor to new project
 * Oct 07, 2013       2361     njensen Removed XML annotations
 * 
 * </pre>
 * 
 * @author jkorman
 * @version 1.1
 */
@Embeddable
@com.raytheon.uf.common.serialization.annotations.DynamicSerialize
public class HwstagesId extends com.raytheon.uf.common.dataplugin.persist.PersistableDataObject implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private String lid;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double fs;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double wstg;

    @com.raytheon.uf.common.serialization.annotations.DynamicSerializeElement
    private Double ms;

    public HwstagesId() {
    }

    public HwstagesId(String lid, Double fs, Double wstg, Double ms) {
        this.lid = lid;
        this.fs = fs;
        this.wstg = wstg;
        this.ms = ms;
    }

    @Column(name = "lid", length = 8)
    public String getLid() {
        return this.lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    @Column(name = "fs", precision = 17, scale = 17)
    public Double getFs() {
        return this.fs;
    }

    public void setFs(Double fs) {
        this.fs = fs;
    }

    @Column(name = "wstg", precision = 17, scale = 17)
    public Double getWstg() {
        return this.wstg;
    }

    public void setWstg(Double wstg) {
        this.wstg = wstg;
    }

    @Column(name = "ms", precision = 17, scale = 17)
    public Double getMs() {
        return this.ms;
    }

    public void setMs(Double ms) {
        this.ms = ms;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof HwstagesId))
            return false;
        HwstagesId castOther = (HwstagesId) other;

        return ((this.getLid() == castOther.getLid()) || (this.getLid() != null
                && castOther.getLid() != null && this.getLid().equals(
                castOther.getLid())))
                && ((this.getFs() == castOther.getFs()) || (this.getFs() != null
                        && castOther.getFs() != null && this.getFs().equals(
                        castOther.getFs())))
                && ((this.getWstg() == castOther.getWstg()) || (this.getWstg() != null
                        && castOther.getWstg() != null && this.getWstg()
                        .equals(castOther.getWstg())))
                && ((this.getMs() == castOther.getMs()) || (this.getMs() != null
                        && castOther.getMs() != null && this.getMs().equals(
                        castOther.getMs())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result
                + (getLid() == null ? 0 : this.getLid().hashCode());
        result = 37 * result + (getFs() == null ? 0 : this.getFs().hashCode());
        result = 37 * result
                + (getWstg() == null ? 0 : this.getWstg().hashCode());
        result = 37 * result + (getMs() == null ? 0 : this.getMs().hashCode());
        return result;
    }

}
