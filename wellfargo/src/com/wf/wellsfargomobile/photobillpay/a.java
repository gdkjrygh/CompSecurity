// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.util.SendAndForgetRequestService;
import java.util.ArrayList;

public class a
{

    public static void a(String s)
    {
        String s1 = (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append("/bev/photoBillpayLinkClickEvent.action").toString();
        Object obj = new ArrayList();
        ArrayList arraylist = new ArrayList();
        ((ArrayList) (obj)).add("linkName");
        arraylist.add("QR_PaybyQRCode");
        ((ArrayList) (obj)).add("referrerPage");
        arraylist.add(s);
        s = new Bundle();
        s.putStringArrayList("KEY_SEND_FORGET_PARAM_NAMES", ((ArrayList) (obj)));
        s.putStringArrayList("KEY_SEND_FORGET_PARAM_VALUES", arraylist);
        obj = new Intent(WFApp.g, com/wf/wellsfargomobile/util/SendAndForgetRequestService);
        ((Intent) (obj)).putExtra("KEY_SEND_FORGET_URL", s1);
        ((Intent) (obj)).putExtra("KEY_SEND_FORGET_MODE", "POST");
        ((Intent) (obj)).putExtra("KEY_SEND_FORGET_PARAM_BUNDLE", s);
        WFApp.g.startService(((Intent) (obj)));
    }

    public static void b(String s)
    {
        String s1 = (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append("/bev/photoBillpayScanCodeEvent.action").toString();
        Object obj = new ArrayList();
        ArrayList arraylist = new ArrayList();
        ((ArrayList) (obj)).add("ERROR_CODE");
        arraylist.add(s);
        s = new Bundle();
        s.putStringArrayList("KEY_SEND_FORGET_PARAM_NAMES", ((ArrayList) (obj)));
        s.putStringArrayList("KEY_SEND_FORGET_PARAM_VALUES", arraylist);
        obj = new Intent(WFApp.g, com/wf/wellsfargomobile/util/SendAndForgetRequestService);
        ((Intent) (obj)).putExtra("KEY_SEND_FORGET_URL", s1);
        ((Intent) (obj)).putExtra("KEY_SEND_FORGET_MODE", "POST");
        ((Intent) (obj)).putExtra("KEY_SEND_FORGET_PARAM_BUNDLE", s);
        WFApp.g.startService(((Intent) (obj)));
    }
}
