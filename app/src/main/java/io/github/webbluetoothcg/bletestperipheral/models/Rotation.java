package io.github.webbluetoothcg.bletestperipheral.models;

import android.util.Log;

import java.text.DecimalFormat;

public class Rotation {

    private static final String TAG = "ROTATION";
    private Number x;
    private Number y;
    private Number z;


    public Rotation(Number x, Number y, Number z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Number getX() {
        return x;
    }

    public void setX(Number x) {
        this.x = x;
    }

    public Number getY() {
        return y;
    }

    public void setY(Number y) {
        this.y = y;
    }

    public Number getZ() {
        return z;
    }

    public void setZ(Number z) {
        this.z = z;
    }

    public void setXYX(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }
    public Number getXYZ() {

        DecimalFormat df = new DecimalFormat("0.000");
        String f = "" + df.format(this.x);// + this.y + this.z;
        Log.d(TAG,">"+ f );
        f= f.replaceAll("[^0-9]", "");
        Log.d(TAG,f);
        Number num=Integer.parseInt(f);
        Log.d(TAG,">>"+num);
        return num;
    }

    @Override
    public String toString() {
        return "{" +
                "x:" + x +
                ", y:" + y +
                ", z:" + z +
                '}';
    }
}
