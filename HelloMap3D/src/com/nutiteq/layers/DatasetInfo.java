package com.nutiteq.layers;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Vector;

import com.vividsolutions.jts.geom.Envelope;

public class DatasetInfo implements Serializable{

    private static final long serialVersionUID = -481536974330949149L;

    public final String name;
    public final Vector<String> dataFile;
    public final double bestZoom;
    public final int id;
    public final Envelope envelope;
    public final double[][] boundsWgs84;
    
    DatasetInfo(final String name,final Vector<String> dataSets,final double bestZoom, final int id, final Envelope envelope, final double[][] boundsWgs84){
        this.name = name;
        this.dataFile = dataSets;
        this.bestZoom = bestZoom;
        this.id = id;
        this.envelope = envelope;
        this.boundsWgs84 = boundsWgs84;
    }

    @Override
    public String toString() {
        return "DatasetInfo [name=" + name + ", dataFile=" + dataFile
                + ", bestZoom=" + bestZoom + ", id=" + id + ", envelope="
                + envelope + ", boundsWgs84=" + Arrays.deepToString(boundsWgs84)
                + "]";
    }

}