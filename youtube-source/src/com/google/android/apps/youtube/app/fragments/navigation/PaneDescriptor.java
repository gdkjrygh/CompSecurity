// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.app.fragments.PaneFragment;
import com.google.android.apps.youtube.app.search.SearchType;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.datalib.innertube.a.a;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

// Referenced classes of package com.google.android.apps.youtube.app.fragments.navigation:
//            c

public class PaneDescriptor
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.apps.youtube.app.fragments.navigation.c();
    private final Bundle args;
    private final Class fragmentClass;

    private PaneDescriptor(Parcel parcel)
    {
        try
        {
            fragmentClass = Class.forName(parcel.readString());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new IllegalArgumentException("Failed to read fragmentClass.");
        }
        args = (Bundle)parcel.readParcelable(null);
    }

    PaneDescriptor(Parcel parcel, com.google.android.apps.youtube.app.fragments.navigation.c c1)
    {
        this(parcel);
    }

    protected PaneDescriptor(Class class1, Bundle bundle)
    {
        c.a(class1);
        c.a(bundle);
        fragmentClass = class1;
        args = bundle;
    }

    private static boolean areBundleNavigationEndpointsEqual(Bundle bundle, Bundle bundle1)
    {
        boolean flag = true;
        boolean flag2 = bundle.containsKey("navigation_endpoint");
        boolean flag1 = bundle1.containsKey("navigation_endpoint");
        if (flag2 && !flag1 || !flag2 && flag1)
        {
            flag = false;
        } else
        if (flag2 || flag1)
        {
            return a.a(getNavigationEndpointFromBundle(bundle), getNavigationEndpointFromBundle(bundle1), true);
        }
        return flag;
    }

    private static kz getNavigationEndpointFromBundle(Bundle bundle)
    {
        bundle = bundle.getByteArray("navigation_endpoint");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        kz kz1;
        kz1 = new kz();
        com.google.protobuf.nano.c.a(kz1, bundle);
        return kz1;
        bundle;
        return null;
    }

    private static Bundle toComparableArgs(Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle.containsKey("navigation_endpoint"))
        {
            bundle1 = new Bundle(bundle);
            bundle1.remove("navigation_endpoint");
        }
        return bundle1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof PaneDescriptor)
        {
            obj = (PaneDescriptor)obj;
            flag = flag1;
            if (fragmentClass == ((PaneDescriptor) (obj)).fragmentClass)
            {
                flag = flag1;
                if (Util.a(toComparableArgs(args), toComparableArgs(((PaneDescriptor) (obj)).args)))
                {
                    flag = flag1;
                    if (areBundleNavigationEndpointsEqual(args, ((PaneDescriptor) (obj)).args))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public String getArgString(String s)
    {
        return args.getString(s);
    }

    public String getName()
    {
        return fragmentClass.getName();
    }

    public kz getNavigationEndpoint()
    {
        return getNavigationEndpointFromBundle(args);
    }

    public SearchType getSearchType()
    {
        return SearchType.fromString(args.getString("search_type"));
    }

    public boolean isCheckPoint()
    {
        return true;
    }

    public boolean isGuideEntry()
    {
        return args.getBoolean("guide_entry", false);
    }

    public boolean mustAuthenticate()
    {
        return args.getBoolean("must_authenticate", false);
    }

    public final PaneFragment newFragment()
    {
        PaneFragment panefragment;
        try
        {
            panefragment = (PaneFragment)fragmentClass.newInstance();
        }
        catch (InstantiationException instantiationexception)
        {
            instantiationexception = null;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            illegalaccessexception = null;
        }
        if (panefragment != null)
        {
            panefragment.g(new Bundle(args));
        }
        return panefragment;
    }

    public void setNavigationEndpoint(kz kz1)
    {
        args.putByteArray("navigation_endpoint", com.google.protobuf.nano.c.a(kz1));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(fragmentClass.getName());
        parcel.writeParcelable(args, i);
    }

}
