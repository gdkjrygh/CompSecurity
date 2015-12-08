// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzlc;

// Referenced classes of package com.google.android.gms.games.event:
//            Event, EventEntityCreator

public final class EventEntity
    implements SafeParcelable, Event
{

    public static final EventEntityCreator CREATOR = new EventEntityCreator();
    private final String mName;
    private final int zzCY;
    private final String zzakM;
    private final Uri zzanf;
    private final String zzanq;
    private final String zzaoK;
    private final long zzaoL;
    private final String zzaoM;
    private final boolean zzaoN;
    private final PlayerEntity zzaog;

    EventEntity(int i, String s, String s1, String s2, Uri uri, String s3, Player player, 
            long l, String s4, boolean flag)
    {
        zzCY = i;
        zzaoK = s;
        mName = s1;
        zzakM = s2;
        zzanf = uri;
        zzanq = s3;
        zzaog = new PlayerEntity(player);
        zzaoL = l;
        zzaoM = s4;
        zzaoN = flag;
    }

    public EventEntity(Event event)
    {
        zzCY = 1;
        zzaoK = event.getEventId();
        mName = event.getName();
        zzakM = event.getDescription();
        zzanf = event.getIconImageUri();
        zzanq = event.getIconImageUrl();
        zzaog = (PlayerEntity)event.getPlayer().freeze();
        zzaoL = event.getValue();
        zzaoM = event.getFormattedValue();
        zzaoN = event.isVisible();
    }

    static int zza(Event event)
    {
        return zzt.hashCode(new Object[] {
            event.getEventId(), event.getName(), event.getDescription(), event.getIconImageUri(), event.getIconImageUrl(), event.getPlayer(), Long.valueOf(event.getValue()), event.getFormattedValue(), Boolean.valueOf(event.isVisible())
        });
    }

    static boolean zza(Event event, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Event) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (event == obj) goto _L4; else goto _L3
_L3:
        obj = (Event)obj;
        if (!zzt.equal(((Event) (obj)).getEventId(), event.getEventId()) || !zzt.equal(((Event) (obj)).getName(), event.getName()) || !zzt.equal(((Event) (obj)).getDescription(), event.getDescription()) || !zzt.equal(((Event) (obj)).getIconImageUri(), event.getIconImageUri()) || !zzt.equal(((Event) (obj)).getIconImageUrl(), event.getIconImageUrl()) || !zzt.equal(((Event) (obj)).getPlayer(), event.getPlayer()) || !zzt.equal(Long.valueOf(((Event) (obj)).getValue()), Long.valueOf(event.getValue())) || !zzt.equal(((Event) (obj)).getFormattedValue(), event.getFormattedValue()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(Boolean.valueOf(((Event) (obj)).isVisible()), Boolean.valueOf(event.isVisible()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Event event)
    {
        return zzt.zzt(event).zzg("Id", event.getEventId()).zzg("Name", event.getName()).zzg("Description", event.getDescription()).zzg("IconImageUri", event.getIconImageUri()).zzg("IconImageUrl", event.getIconImageUrl()).zzg("Player", event.getPlayer()).zzg("Value", Long.valueOf(event.getValue())).zzg("FormattedValue", event.getFormattedValue()).zzg("isVisible", Boolean.valueOf(event.isVisible())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Event freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getDescription()
    {
        return zzakM;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzakM, chararraybuffer);
    }

    public String getEventId()
    {
        return zzaoK;
    }

    public String getFormattedValue()
    {
        return zzaoM;
    }

    public void getFormattedValue(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzaoM, chararraybuffer);
    }

    public Uri getIconImageUri()
    {
        return zzanf;
    }

    public String getIconImageUrl()
    {
        return zzanq;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(mName, chararraybuffer);
    }

    public Player getPlayer()
    {
        return zzaog;
    }

    public long getValue()
    {
        return zzaoL;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isVisible()
    {
        return zzaoN;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        EventEntityCreator.zza(this, parcel, i);
    }

}
