// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.d;
import com.google.android.gms.drive.metadata.internal.a;
import com.google.android.gms.drive.metadata.internal.e;

// Referenced classes of package com.google.android.gms.internal:
//            hg, hd

public final class hc
{

    public static final b a;
    public static final b b = new d("title");
    public static final b c = new d("mimeType");
    public static final b d = new a("starred");
    public static final b e = new hd("trashed");
    public static final b f = new a("isEditable");
    public static final b g = new a("isPinned");
    public static final com.google.android.gms.drive.metadata.a h = new e("parents");

    static 
    {
        a = com.google.android.gms.internal.hg.a;
    }
}
