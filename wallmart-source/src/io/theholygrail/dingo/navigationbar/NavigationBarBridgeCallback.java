// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigationbar;


// Referenced classes of package io.theholygrail.dingo.navigationbar:
//            Button

public interface NavigationBarBridgeCallback
{
    public static interface OnClickListener
    {

        public abstract void onClick(String s);
    }


    public abstract void setButtons(Button abutton[], OnClickListener onclicklistener);

    public abstract void setTitle(String s);
}
