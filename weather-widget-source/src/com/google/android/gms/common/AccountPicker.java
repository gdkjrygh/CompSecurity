// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public final class AccountPicker
{

    private AccountPicker()
    {
    }

    public static Intent newChooseAccountIntent(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle)
    {
        return zza(account, arraylist, as, flag, s, s1, as1, bundle, false);
    }

    public static Intent zza(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle, 
            boolean flag1)
    {
        return zza(account, arraylist, as, flag, s, s1, as1, bundle, flag1, 0, 0);
    }

    public static Intent zza(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle, 
            boolean flag1, int i, int j)
    {
        return zza(account, arraylist, as, flag, s, s1, as1, bundle, flag1, i, j, false);
    }

    public static Intent zza(Account account, ArrayList arraylist, String as[], boolean flag, String s, String s1, String as1[], Bundle bundle, 
            boolean flag1, int i, int j, boolean flag2)
    {
        Intent intent = new Intent();
        String s2;
        if (flag2)
        {
            s2 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE";
        } else
        {
            s2 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT";
        }
        intent.setAction(s2);
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arraylist);
        intent.putExtra("allowableAccountTypes", as);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", flag);
        intent.putExtra("descriptionTextOverride", s);
        intent.putExtra("authTokenType", s1);
        intent.putExtra("addAccountRequiredFeatures", as1);
        intent.putExtra("setGmsCoreAccount", flag1);
        intent.putExtra("overrideTheme", i);
        intent.putExtra("overrideCustomTheme", j);
        return intent;
    }
}
