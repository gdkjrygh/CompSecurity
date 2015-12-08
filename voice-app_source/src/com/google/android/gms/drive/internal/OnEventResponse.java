// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.ProgressEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzaz

public class OnEventResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzaz();
    final int zzCY;
    final int zzaca;
    final ChangeEvent zzagj;
    final CompletionEvent zzagk;
    final QueryResultEventParcelable zzagl;
    final ChangesAvailableEvent zzagm;
    final ProgressEvent zzagn;

    OnEventResponse(int i, int j, ChangeEvent changeevent, CompletionEvent completionevent, QueryResultEventParcelable queryresulteventparcelable, ChangesAvailableEvent changesavailableevent, ProgressEvent progressevent)
    {
        zzCY = i;
        zzaca = j;
        zzagj = changeevent;
        zzagk = completionevent;
        zzagl = queryresulteventparcelable;
        zzagm = changesavailableevent;
        zzagn = progressevent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaz.zza(this, parcel, i);
    }

    public DriveEvent zzpO()
    {
        switch (zzaca)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unexpected event type ").append(zzaca).toString());

        case 1: // '\001'
            return zzagj;

        case 2: // '\002'
            return zzagk;

        case 3: // '\003'
            return zzagl;

        case 4: // '\004'
            return zzagm;

        case 5: // '\005'
        case 6: // '\006'
            return zzagn;
        }
    }

}
