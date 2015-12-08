// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import android.graphics.PointF;
import com.arubanetworks.meridian.editor.EditorKey;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.arubanetworks.meridian.location:
//            LocationProvider

public class MeridianLocation
    implements Serializable
{

    private EditorKey a;
    private double b;
    private Date c;
    private transient PointF d;
    private transient LocationProvider e;

    public MeridianLocation()
    {
        c = new Date();
    }

    public MeridianLocation(MeridianLocation meridianlocation)
    {
        a = meridianlocation.a;
        b = meridianlocation.getAccuracy();
        c = new Date(meridianlocation.getTimestamp().getTime());
        PointF pointf;
        if (meridianlocation.getPoint() != null)
        {
            pointf = new PointF(meridianlocation.getPoint().x, meridianlocation.getPoint().y);
        } else
        {
            pointf = null;
        }
        d = pointf;
        e = meridianlocation.e;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        d = new PointF(objectinputstream.readFloat(), objectinputstream.readFloat());
        if (d.x == (0.0F / 0.0F) || d.y == (0.0F / 0.0F))
        {
            d = null;
        }
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        if (d != null)
        {
            objectoutputstream.writeFloat(d.x);
            objectoutputstream.writeFloat(d.y);
            return;
        } else
        {
            objectoutputstream.writeFloat((0.0F / 0.0F));
            objectoutputstream.writeFloat((0.0F / 0.0F));
            return;
        }
    }

    public double getAccuracy()
    {
        return b;
    }

    public long getAgeMillis()
    {
        return System.currentTimeMillis() - c.getTime();
    }

    public EditorKey getMap()
    {
        return a;
    }

    public EditorKey getMapKey()
    {
        return a;
    }

    public PointF getPoint()
    {
        return d;
    }

    public LocationProvider getProvider()
    {
        return e;
    }

    public Date getTimestamp()
    {
        return c;
    }

    public boolean isInvalid()
    {
        return a == null || d == null || Float.isNaN(d.x) || Float.isNaN(d.y);
    }

    public void setAccuracy(double d1)
    {
        b = d1;
    }

    public void setMap(EditorKey editorkey)
    {
        a = editorkey;
    }

    public void setPoint(PointF pointf)
    {
        d = pointf;
    }

    public void setProvider(LocationProvider locationprovider)
    {
        e = locationprovider;
    }

    public String toString()
    {
        String s;
        PointF pointf;
        if (a != null)
        {
            s = a.getId();
        } else
        {
            s = "<null>";
        }
        if (d != null)
        {
            pointf = d;
        } else
        {
            pointf = new PointF(0.0F, 0.0F);
        }
        return String.format("<Location: map=%s, point=(%f, %f), accuracy=%s provider=%s>", new Object[] {
            s, Float.valueOf(pointf.x), Float.valueOf(pointf.y), Double.valueOf(b), e
        });
    }
}
