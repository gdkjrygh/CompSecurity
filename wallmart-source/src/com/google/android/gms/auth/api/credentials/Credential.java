// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            zza

public class Credential
    implements SafeParcelable
{
    public static class Builder
    {

        private String mName;
        private String zzRa;
        private String zzRb;
        private Uri zzRc;
        private List zzRd;
        private String zzRe;
        private String zzRf;
        private String zzRg;
        private String zzRh;
        private final String zzwj;

        public Credential build()
        {
            if (!TextUtils.isEmpty(zzRe) && !TextUtils.isEmpty(zzRf))
            {
                throw new IllegalStateException("Only one of password or accountType may be set");
            } else
            {
                return new Credential(2, zzRa, zzRb, zzwj, mName, zzRc, zzRd, zzRe, zzRf, zzRg, zzRh);
            }
        }

        public Builder setAccountType(String s)
        {
            String s1 = Uri.parse(s).getScheme();
            boolean flag;
            if ("http".equalsIgnoreCase(s1) || "https".equalsIgnoreCase(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zzZ(flag);
            zzRf = s;
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            return this;
        }

        public Builder setPassword(String s)
        {
            zzRe = s;
            return this;
        }

        public Builder setProfilePictureUri(Uri uri)
        {
            zzRc = uri;
            return this;
        }

        public Builder(Credential credential)
        {
            zzwj = Credential.zza(credential);
            mName = Credential.zzb(credential);
            zzRc = Credential.zzc(credential);
            zzRd = Credential.zzd(credential);
            zzRe = Credential.zze(credential);
            zzRf = Credential.zzf(credential);
            zzRg = Credential.zzg(credential);
            zzRa = Credential.zzh(credential);
            zzRb = Credential.zzi(credential);
            zzRh = Credential.zzj(credential);
        }

        public Builder(String s)
        {
            zzwj = s;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zza();
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    private final String mName;
    final int mVersionCode;
    private final String zzRa;
    private final String zzRb;
    private final Uri zzRc;
    private final List zzRd;
    private final String zzRe;
    private final String zzRf;
    private final String zzRg;
    private final String zzRh;
    private final String zzwj;

    Credential(int i, String s, String s1, String s2, String s3, Uri uri, List list, 
            String s4, String s5, String s6, String s7)
    {
        mVersionCode = i;
        zzRa = s;
        zzRb = s1;
        zzwj = (String)zzx.zzv(s2);
        mName = s3;
        zzRc = uri;
        if (list == null)
        {
            s = Collections.emptyList();
        } else
        {
            s = Collections.unmodifiableList(list);
        }
        zzRd = s;
        zzRe = s4;
        zzRf = s5;
        zzRg = s6;
        zzRh = s7;
    }

    static String zza(Credential credential)
    {
        return credential.zzwj;
    }

    static String zzb(Credential credential)
    {
        return credential.mName;
    }

    static Uri zzc(Credential credential)
    {
        return credential.zzRc;
    }

    static List zzd(Credential credential)
    {
        return credential.zzRd;
    }

    static String zze(Credential credential)
    {
        return credential.zzRe;
    }

    static String zzf(Credential credential)
    {
        return credential.zzRf;
    }

    static String zzg(Credential credential)
    {
        return credential.zzRg;
    }

    static String zzh(Credential credential)
    {
        return credential.zzRa;
    }

    static String zzi(Credential credential)
    {
        return credential.zzRb;
    }

    static String zzj(Credential credential)
    {
        return credential.zzRh;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Credential))
            {
                return false;
            }
            obj = (Credential)obj;
            if (!TextUtils.equals(zzwj, ((Credential) (obj)).zzwj) || !TextUtils.equals(mName, ((Credential) (obj)).mName) || !zzw.equal(zzRc, ((Credential) (obj)).zzRc) || !TextUtils.equals(zzRe, ((Credential) (obj)).zzRe) || !TextUtils.equals(zzRf, ((Credential) (obj)).zzRf) || !TextUtils.equals(zzRg, ((Credential) (obj)).zzRg))
            {
                return false;
            }
        }
        return true;
    }

    public String getAccountType()
    {
        return zzRf;
    }

    public String getGeneratedPassword()
    {
        return zzRg;
    }

    public String getId()
    {
        return zzwj;
    }

    public String getName()
    {
        return mName;
    }

    public String getPassword()
    {
        return zzRe;
    }

    public Uri getProfilePictureUri()
    {
        return zzRc;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzwj, mName, zzRc, zzRe, zzRf, zzRg
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.credentials.zza.zza(this, parcel, i);
    }

    public String zzlr()
    {
        return zzRa;
    }

    public String zzls()
    {
        return zzRb;
    }

    public List zzlt()
    {
        return zzRd;
    }

    public String zzlu()
    {
        return zzRh;
    }

}
