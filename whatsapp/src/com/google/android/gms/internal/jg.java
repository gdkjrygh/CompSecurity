// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import java.util.Collection;
import java.util.List;

public final class jg
{

    private final View JJ;
    private final a Mw;

    public jg(String s, Collection collection, int i, View view, String s1)
    {
        Mw = new a(s, collection, i, s1);
        JJ = view;
    }

    public String getAccountName()
    {
        return Mw.getAccountName();
    }

    public List ho()
    {
        return Mw.ho();
    }

    private class a
        implements SafeParcelable
    {

        public static final jw CREATOR = new jw();
        private final int CK;
        private final String DZ;
        private final int JI;
        private final String JK;
        private final List Kh;

        public int describeContents()
        {
            return 0;
        }

        public String getAccountName()
        {
            return DZ;
        }

        public int getVersionCode()
        {
            return CK;
        }

        public int hn()
        {
            return JI;
        }

        public List ho()
        {
            return new ArrayList(Kh);
        }

        public String hq()
        {
            return JK;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            jw.a(this, parcel, i);
        }


        a(int i, String s, List list, int j, String s1)
        {
            Kh = new ArrayList();
            CK = i;
            DZ = s;
            Kh.addAll(list);
            JI = j;
            JK = s1;
        }

        public a(String s, Collection collection, int i, String s1)
        {
            this(3, s, ((List) (new ArrayList(collection))), i, s1);
        }
    }

}
