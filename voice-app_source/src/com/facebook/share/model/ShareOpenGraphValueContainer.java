// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.share.model:
//            ShareModel, ShareOpenGraphObject, SharePhoto, ShareModelBuilder

public abstract class ShareOpenGraphValueContainer
    implements ShareModel
{
    public static abstract class Builder
        implements ShareModelBuilder
    {

        private Bundle bundle;

        public Builder putBoolean(String s, boolean flag)
        {
            bundle.putBoolean(s, flag);
            return this;
        }

        public Builder putBooleanArray(String s, boolean aflag[])
        {
            bundle.putBooleanArray(s, aflag);
            return this;
        }

        public Builder putDouble(String s, double d)
        {
            bundle.putDouble(s, d);
            return this;
        }

        public Builder putDoubleArray(String s, double ad[])
        {
            bundle.putDoubleArray(s, ad);
            return this;
        }

        public Builder putInt(String s, int i)
        {
            bundle.putInt(s, i);
            return this;
        }

        public Builder putIntArray(String s, int ai[])
        {
            bundle.putIntArray(s, ai);
            return this;
        }

        public Builder putLong(String s, long l)
        {
            bundle.putLong(s, l);
            return this;
        }

        public Builder putLongArray(String s, long al[])
        {
            bundle.putLongArray(s, al);
            return this;
        }

        public Builder putObject(String s, ShareOpenGraphObject shareopengraphobject)
        {
            bundle.putParcelable(s, shareopengraphobject);
            return this;
        }

        public Builder putObjectArrayList(String s, ArrayList arraylist)
        {
            bundle.putParcelableArrayList(s, arraylist);
            return this;
        }

        public Builder putPhoto(String s, SharePhoto sharephoto)
        {
            bundle.putParcelable(s, sharephoto);
            return this;
        }

        public Builder putPhotoArrayList(String s, ArrayList arraylist)
        {
            bundle.putParcelableArrayList(s, arraylist);
            return this;
        }

        public Builder putString(String s, String s1)
        {
            bundle.putString(s, s1);
            return this;
        }

        public Builder putStringArrayList(String s, ArrayList arraylist)
        {
            bundle.putStringArrayList(s, arraylist);
            return this;
        }

        public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((ShareOpenGraphValueContainer)sharemodel);
        }

        public Builder readFrom(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
        {
            if (shareopengraphvaluecontainer != null)
            {
                bundle.putAll(shareopengraphvaluecontainer.getBundle());
            }
            return this;
        }


        public Builder()
        {
            bundle = new Bundle();
        }
    }


    private final Bundle bundle;

    ShareOpenGraphValueContainer(Parcel parcel)
    {
        bundle = parcel.readBundle(com/facebook/share/model/ShareOpenGraphValueContainer$Builder.getClassLoader());
    }

    protected ShareOpenGraphValueContainer(Builder builder)
    {
        bundle = (Bundle)builder.bundle.clone();
    }

    public int describeContents()
    {
        return 0;
    }

    public Object get(String s)
    {
        return bundle.get(s);
    }

    public boolean getBoolean(String s, boolean flag)
    {
        return bundle.getBoolean(s, flag);
    }

    public boolean[] getBooleanArray(String s)
    {
        return bundle.getBooleanArray(s);
    }

    public Bundle getBundle()
    {
        return (Bundle)bundle.clone();
    }

    public double getDouble(String s, double d)
    {
        return bundle.getDouble(s, d);
    }

    public double[] getDoubleArray(String s)
    {
        return bundle.getDoubleArray(s);
    }

    public int getInt(String s, int i)
    {
        return bundle.getInt(s, i);
    }

    public int[] getIntArray(String s)
    {
        return bundle.getIntArray(s);
    }

    public long getLong(String s, long l)
    {
        return bundle.getLong(s, l);
    }

    public long[] getLongArray(String s)
    {
        return bundle.getLongArray(s);
    }

    public ShareOpenGraphObject getObject(String s)
    {
        s = ((String) (bundle.get(s)));
        if (s instanceof ShareOpenGraphObject)
        {
            return (ShareOpenGraphObject)s;
        } else
        {
            return null;
        }
    }

    public ArrayList getObjectArrayList(String s)
    {
        s = bundle.getParcelableArrayList(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        ArrayList arraylist = new ArrayList();
        Iterator iterator = s.iterator();
        do
        {
            s = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            s = (Parcelable)iterator.next();
            if (s instanceof ShareOpenGraphObject)
            {
                arraylist.add((ShareOpenGraphObject)s);
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public SharePhoto getPhoto(String s)
    {
        s = bundle.getParcelable(s);
        if (s instanceof SharePhoto)
        {
            return (SharePhoto)s;
        } else
        {
            return null;
        }
    }

    public ArrayList getPhotoArrayList(String s)
    {
        s = bundle.getParcelableArrayList(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        ArrayList arraylist = new ArrayList();
        Iterator iterator = s.iterator();
        do
        {
            s = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            s = (Parcelable)iterator.next();
            if (s instanceof SharePhoto)
            {
                arraylist.add((SharePhoto)s);
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getString(String s)
    {
        return bundle.getString(s);
    }

    public ArrayList getStringArrayList(String s)
    {
        return bundle.getStringArrayList(s);
    }

    public Set keySet()
    {
        return bundle.keySet();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBundle(bundle);
    }
}
