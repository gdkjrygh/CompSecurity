// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;


// Referenced classes of package com.walmartlabs.payment.service.customer:
//            EncryptCreditCardService

private static final class  extends Enum
{

    private static final DONE $VALUES[];
    public static final DONE ALGORITHM_LOADED;
    public static final DONE DONE;
    public static final DONE ENCRYPTING;
    public static final DONE IDLE;
    public static final DONE KEY_LOADED;
    public static final DONE LOADING_JS;
    public static final DONE LOADING_PAGE;
    public static final DONE PAGE_LOADED;
    public static final DONE READY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/payment/service/customer/EncryptCreditCardService$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IDLE = new <init>("IDLE", 0);
        LOADING_PAGE = new <init>("LOADING_PAGE", 1);
        PAGE_LOADED = new <init>("PAGE_LOADED", 2);
        LOADING_JS = new <init>("LOADING_JS", 3);
        KEY_LOADED = new <init>("KEY_LOADED", 4);
        ALGORITHM_LOADED = new <init>("ALGORITHM_LOADED", 5);
        READY = new <init>("READY", 6);
        ENCRYPTING = new <init>("ENCRYPTING", 7);
        DONE = new <init>("DONE", 8);
        $VALUES = (new .VALUES[] {
            IDLE, LOADING_PAGE, PAGE_LOADED, LOADING_JS, KEY_LOADED, ALGORITHM_LOADED, READY, ENCRYPTING, DONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
