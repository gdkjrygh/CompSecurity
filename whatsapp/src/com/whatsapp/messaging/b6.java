// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.protocol.VoipOptions;

// Referenced classes of package com.whatsapp.messaging:
//            a9, ac, a0, i, 
//            ab, br, p, au

final class b6
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a9();
    private final p a;
    private final au b;
    private final a0 c;
    private final i d;
    private final ac e;
    private final br f;
    private final ab g;
    private final VoipOptions h;

    private b6(Parcel parcel)
    {
        com.whatsapp.protocol.VoipOptions.NoiseSuppression noisesuppression = null;
        super();
        e = (ac)parcel.readValue(com/whatsapp/messaging/ac.getClassLoader());
        c = (a0)parcel.readValue(com/whatsapp/messaging/a0.getClassLoader());
        d = (i)parcel.readValue(com/whatsapp/messaging/i.getClassLoader());
        g = (ab)parcel.readValue(com/whatsapp/messaging/ab.getClassLoader());
        f = (br)parcel.readValue(com/whatsapp/messaging/br.getClassLoader());
        a = (p)parcel.readValue(com/whatsapp/messaging/p.getClassLoader());
        b = (au)parcel.readValue(com/whatsapp/messaging/au.getClassLoader());
        com.whatsapp.protocol.VoipOptions.Encode encode;
        com.whatsapp.protocol.VoipOptions.Decode decode;
        com.whatsapp.protocol.VoipOptions.Miscellaneous miscellaneous;
        com.whatsapp.protocol.VoipOptions.Agc agc;
        com.whatsapp.protocol.VoipOptions.AudioRestrict audiorestrict;
        if (e != null)
        {
            parcel = e.a();
        } else
        {
            parcel = null;
        }
        if (f != null)
        {
            encode = f.a();
        } else
        {
            encode = null;
        }
        if (g != null)
        {
            decode = g.a();
        } else
        {
            decode = null;
        }
        if (a != null)
        {
            miscellaneous = a.a();
        } else
        {
            miscellaneous = null;
        }
        if (c != null)
        {
            agc = c.a();
        } else
        {
            agc = null;
        }
        if (d != null)
        {
            audiorestrict = d.a();
        } else
        {
            audiorestrict = null;
        }
        if (b != null)
        {
            noisesuppression = b.a();
        }
        h = new VoipOptions(parcel, encode, decode, miscellaneous, agc, audiorestrict, noisesuppression);
    }

    b6(Parcel parcel, a9 a9_1)
    {
        this(parcel);
    }

    b6(VoipOptions voipoptions)
    {
        Object obj1 = null;
        super();
        h = voipoptions;
        Object obj;
        if (voipoptions.aec != null)
        {
            obj = new ac(voipoptions.aec, null);
        } else
        {
            obj = null;
        }
        e = ((ac) (obj));
        if (voipoptions.agc != null)
        {
            obj = new a0(voipoptions.agc, null);
        } else
        {
            obj = null;
        }
        c = ((a0) (obj));
        if (voipoptions.audioRestrict != null)
        {
            obj = new i(voipoptions.audioRestrict, null);
        } else
        {
            obj = null;
        }
        d = ((i) (obj));
        if (voipoptions.decode != null)
        {
            obj = new ab(voipoptions.decode, null);
        } else
        {
            obj = null;
        }
        g = ((ab) (obj));
        if (voipoptions.encode != null)
        {
            obj = new br(voipoptions.encode, null);
        } else
        {
            obj = null;
        }
        f = ((br) (obj));
        if (voipoptions.miscellaneous != null)
        {
            obj = new p(voipoptions.miscellaneous, null);
        } else
        {
            obj = null;
        }
        a = ((p) (obj));
        obj = obj1;
        if (voipoptions.noiseSuppression != null)
        {
            obj = new au(voipoptions.noiseSuppression, null);
        }
        b = ((au) (obj));
    }

    public VoipOptions a()
    {
        return h;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeValue(e);
        parcel.writeValue(c);
        parcel.writeValue(d);
        parcel.writeValue(g);
        parcel.writeValue(f);
        parcel.writeValue(a);
        parcel.writeValue(b);
    }

}
