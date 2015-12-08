// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net.mocked;

import android.text.TextUtils;
import com.walmartlabs.android.photo.model.wire.WireOrder;
import com.walmartlabs.android.photo.net.PhotoResponse;
import com.walmartlabs.android.photo.util.PhotoObjectMapper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MockedOrderResponse extends PhotoResponse
{

    private static SimpleDateFormat sGmtFormat;
    private static SimpleDateFormat sLocalDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss z");

    public MockedOrderResponse()
    {
        String s = PhotoObjectMapper.get().writeAsString(buildWireOrder());
        if (!TextUtils.isEmpty(s))
        {
            setEntity(s);
            setHttpStatus(202);
            setValid(true);
            return;
        } else
        {
            setHttpStatus(500);
            setValid(true);
            return;
        }
    }

    private WireOrder buildWireOrder()
    {
        WireOrder wireorder = new WireOrder();
        wireorder.setOrderNumber("1776");
        wireorder.setResultCode("SUCCESS");
        Date date = new Date(System.currentTimeMillis() + 0x36ee80L);
        String as[] = sLocalDateFormat.format(date).split(" ");
        com.walmartlabs.android.photo.model.wire.WireOrder.PickupTime pickuptime = new com.walmartlabs.android.photo.model.wire.WireOrder.PickupTime();
        pickuptime.setGmtTimeReturn(sGmtFormat.format(date));
        if (as != null && as.length == 3)
        {
            pickuptime.setLocalDate(as[0]);
            pickuptime.setLocalTime(as[1]);
            pickuptime.setLocalTimeZone(as[2]);
            pickuptime.setTimestampReasonCode("7");
        }
        wireorder.setPickupTime(pickuptime);
        return wireorder;
    }

    public static MockedOrderResponse createWithDelay(long l)
    {
        try
        {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedexception) { }
        return new MockedOrderResponse();
    }

    static 
    {
        sGmtFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'");
        sGmtFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    }
}
