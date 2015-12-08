// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;


public class WalletStatus
{
    public static class Error
    {

        public String message;
        public String name;

        public Error()
        {
        }
    }


    public Error error;
    public int retriesRemaining;
    public int waitWindowMinutes;

    public WalletStatus()
    {
    }
}
