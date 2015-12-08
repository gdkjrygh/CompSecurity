// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcv

static final class zzaSk
    implements Runnable
{

    final android.content.references.Editor zzaSk;

    public void run()
    {
        zzaSk.commit();
    }

    (android.content.references.Editor editor)
    {
        zzaSk = editor;
        super();
    }
}
