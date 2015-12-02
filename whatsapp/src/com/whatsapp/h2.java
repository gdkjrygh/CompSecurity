// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            CallLogActivity

class h2
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final CallLogActivity a;

    h2(CallLogActivity calllogactivity)
    {
        a = calllogactivity;
        super();
    }

    public void onGlobalLayout()
    {
        CallLogActivity.a(a);
    }
}
