// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.fa;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.gg;
import com.google.android.gms.internal.gy;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games:
//            Player, c, f

public final class PlayerEntity extends gg
    implements Player
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int jE;
    private final String uf;
    private final String xU;
    private final long xV;
    private final int xW;
    private final long xX;
    private final Uri xe;
    private final Uri xf;

    PlayerEntity(int i, String s, String s1, Uri uri, Uri uri1, long l, 
            int j, long l1)
    {
        jE = i;
        xU = s;
        uf = s1;
        xe = uri;
        xf = uri1;
        xV = l;
        xW = j;
        xX = l1;
    }

    public PlayerEntity(Player player)
    {
        jE = 3;
        xU = player.getPlayerId();
        uf = player.getDisplayName();
        xe = player.getIconImageUri();
        xf = player.getHiResImageUri();
        xV = player.getRetrievedTimestamp();
        xW = player.dc();
        xX = player.getLastPlayedWithTimestamp();
        fa.a(xU);
        fa.a(uf);
        boolean flag;
        if (xV > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fa.a(flag);
    }

    static int a(Player player)
    {
        return Arrays.hashCode(new Object[] {
            player.getPlayerId(), player.getDisplayName(), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp())
        });
    }

    static boolean a(Player player, Object obj)
    {
        if (obj instanceof Player)
        {
            if (player == obj)
            {
                return true;
            }
            obj = (Player)obj;
            if (ge.a(((Player) (obj)).getPlayerId(), player.getPlayerId()) && ge.a(((Player) (obj)).getDisplayName(), player.getDisplayName()) && ge.a(((Player) (obj)).getIconImageUri(), player.getIconImageUri()) && ge.a(((Player) (obj)).getHiResImageUri(), player.getHiResImageUri()) && ge.a(Long.valueOf(((Player) (obj)).getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())))
            {
                return true;
            }
        }
        return false;
    }

    static boolean an(String s)
    {
        return W(s);
    }

    static String b(Player player)
    {
        return ge.a(player).a("PlayerId", player.getPlayerId()).a("DisplayName", player.getDisplayName()).a("IconImageUri", player.getIconImageUri()).a("HiResImageUri", player.getHiResImageUri()).a("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer db()
    {
        return bR();
    }

    public final int dc()
    {
        return xW;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public final Player freeze()
    {
        return this;
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final String getDisplayName()
    {
        return uf;
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        gy.a(uf, chararraybuffer);
    }

    public final Uri getHiResImageUri()
    {
        return xf;
    }

    public final Uri getIconImageUri()
    {
        return xe;
    }

    public final long getLastPlayedWithTimestamp()
    {
        return xX;
    }

    public final String getPlayerId()
    {
        return xU;
    }

    public final long getRetrievedTimestamp()
    {
        return xV;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final boolean hasHiResImage()
    {
        return getHiResImageUri() != null;
    }

    public final boolean hasIconImage()
    {
        return getIconImageUri() != null;
    }

    public final int hashCode()
    {
        return a(this);
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return b(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        if (!bS())
        {
            f.a(this, parcel, i);
            return;
        }
        parcel.writeString(xU);
        parcel.writeString(uf);
        String s;
        if (xe == null)
        {
            s = null;
        } else
        {
            s = xe.toString();
        }
        parcel.writeString(s);
        if (xf == null)
        {
            s = obj;
        } else
        {
            s = xf.toString();
        }
        parcel.writeString(s);
        parcel.writeLong(xV);
    }

}
