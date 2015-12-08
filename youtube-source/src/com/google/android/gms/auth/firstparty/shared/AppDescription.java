// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            b

public class AppDescription
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    protected static final String TAG = "GLSSession";
    private static final String mi = (new StringBuilder("[")).append(com/google/android/gms/auth/firstparty/shared/AppDescription.getSimpleName()).append("]").toString();
    String hy;
    boolean mn;
    String nA;
    String nB;
    private final String ny;
    int nz;
    final int version;

    AppDescription(int i, int j, String s, String s1, String s2, boolean flag)
    {
        ny = (new StringBuilder("[")).append(getClass().getSimpleName()).append("] %s - %s: %s").toString();
        version = i;
        hy = gi.a(s, (new StringBuilder()).append(mi).append(" sessionId cannot be null or empty!").toString());
        nA = gi.a(s1, (new StringBuilder()).append(mi).append(" sessionSig cannot be null or empty!").toString());
        nB = gi.a(s2, (new StringBuilder()).append(mi).append(" callingPkg cannot be null or empty!").toString());
        boolean flag1;
        if (j != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gi.b(flag1, "Invalid callingUid! Cannot be 0!");
        nz = j;
        mn = flag;
    }

    public AppDescription(String s, int i, String s1, String s2)
    {
        this(1, i, s1, s2, s, false);
        if (Log.isLoggable("GLSSession", 2))
        {
            Log.v("GLSSession", (new StringBuilder("New ")).append(getClass().getSimpleName()).append(" (sessiondId: ").append(hy).append(", sessiondSig: ").append(nA).append(", callingPkg: ").append(nB).append(", callingUid: ").append(nz).append(", ").toString());
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCallingPackage()
    {
        return nB;
    }

    public int getCallingUid()
    {
        return nz;
    }

    public String getPackageName()
    {
        return nB;
    }

    public String getSessionId()
    {
        return hy;
    }

    public String getSessionSignature()
    {
        return nA;
    }

    public int getUid()
    {
        return nz;
    }

    public boolean isSetupWizardInProgress()
    {
        return mn;
    }

    protected void log(String s, int i)
    {
        if (Log.isLoggable("GLSSession", 2))
        {
            Log.v("GLSSession", String.format(ny, new Object[] {
                hy, s, Integer.valueOf(i)
            }));
        }
    }

    protected void log(String s, String s1)
    {
        if (Log.isLoggable("GLSSession", 2))
        {
            if (s1 == null)
            {
                s1 = "<NULL>";
            } else
            if (s1.isEmpty())
            {
                s1 = "<EMPTY>";
            } else
            {
                s1 = "<MEANINFGUL>";
            }
            Log.v("GLSSession", String.format(ny, new Object[] {
                hy, s, s1
            }));
        }
    }

    protected void log(String s, boolean flag)
    {
        if (Log.isLoggable("GLSSession", 2))
        {
            Log.v("GLSSession", String.format(ny, new Object[] {
                hy, s, Boolean.valueOf(flag)
            }));
        }
    }

    public AppDescription setSetupWizardInProgress(boolean flag)
    {
        mn = flag;
        return this;
    }

    public String toString()
    {
        return (new StringBuilder(getClass().getSimpleName())).append("<").append(nB).append(", ").append(nz).append(">").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel);
    }

}
