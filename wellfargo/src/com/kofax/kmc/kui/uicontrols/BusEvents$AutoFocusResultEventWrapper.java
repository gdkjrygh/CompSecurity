// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            AutoFocusResultListener, AutoFocusResultEvent

public final class _listener extends _listener
{

    private boolean a;

    public void onFocusResult(_listener _plistener)
    {
        if (a == _plistener.a)
        {
            return;
        }
        ((AutoFocusResultListener)_listener).onAutoFocus(new AutoFocusResultEvent(this, _plistener._listener));
        a = _plistener.a;
        return;
        Object obj;
        obj;
        logException(((Exception) (obj)));
        a = _plistener.a;
        return;
        obj;
        a = _plistener.a;
        throw obj;
    }

    public (AutoFocusResultListener autofocusresultlistener)
    {
        super(autofocusresultlistener, com/kofax/kmc/kui/uicontrols/AutoFocusResultListener);
        a = false;
        ((AutoFocusResultListener)_listener).onAutoFocus(new AutoFocusResultEvent(this, false));
    }
}
