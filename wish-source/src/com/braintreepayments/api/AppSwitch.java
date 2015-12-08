// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import com.braintreepayments.api.exceptions.AppSwitchNotAvailableException;
import com.braintreepayments.api.models.Configuration;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.security.auth.x500.X500Principal;

public abstract class AppSwitch
{

    public static final String EXTRA_MERCHANT_ID = "com.braintreepayments.api.MERCHANT_ID";
    public static final String EXTRA_OFFLINE = "com.braintreepayments.api.OFFLINE";
    public static final String EXTRA_PAYMENT_METHOD_NONCE = "com.braintreepayments.api.EXTRA_PAYMENT_METHOD_NONCE";
    protected static boolean sEnableSignatureVerification = true;
    protected Configuration mConfiguration;
    protected Context mContext;

    public AppSwitch(Context context, Configuration configuration)
    {
        mContext = context;
        mConfiguration = configuration;
    }

    private boolean isSignatureValid()
    {
        int i;
        if (!sEnableSignatureVerification)
        {
            return true;
        }
        PackageManager packagemanager = mContext.getPackageManager();
        Signature asignature[];
        Object obj;
        String s;
        String s1;
        int j;
        int k;
        int l;
        try
        {
            asignature = packagemanager.getPackageInfo(getPackage(), 64).signatures;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        j = asignature.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = asignature[i];
        obj = new ByteArrayInputStream(((Signature) (obj)).toByteArray());
        obj = (X509Certificate)CertificateFactory.getInstance("X509").generateCertificate(((java.io.InputStream) (obj)));
        s = ((X509Certificate) (obj)).getSubjectX500Principal().getName();
        s1 = ((X509Certificate) (obj)).getIssuerX500Principal().getName();
        k = ((X509Certificate) (obj)).getPublicKey().hashCode();
        if (!getCertificateSubject().equals(s) || !getCertificateIssuer().equals(s1))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        l = getPublicKeyHashCode();
        if (l == k)
        {
            return true;
        }
        return false;
        CertificateException certificateexception;
        certificateexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return false;
    }

    protected abstract String getAppSwitchActivity();

    protected abstract String getCertificateIssuer();

    protected abstract String getCertificateSubject();

    protected Intent getLaunchIntent()
    {
        return (new Intent()).setComponent(new ComponentName(getPackage(), (new StringBuilder()).append(getPackage()).append(".").append(getAppSwitchActivity()).toString()));
    }

    protected abstract String getPackage();

    protected abstract int getPublicKeyHashCode();

    protected abstract String handleAppSwitchResponse(int i, Intent intent);

    protected boolean isAvailable()
    {
        List list = mContext.getPackageManager().queryIntentActivities(getLaunchIntent(), 0);
        return list.size() == 1 && getPackage().equals(((ResolveInfo)list.get(0)).activityInfo.packageName) && isSignatureValid();
    }

    protected void launch(Activity activity, int i)
        throws AppSwitchNotAvailableException
    {
        if (isAvailable())
        {
            activity.startActivityForResult(getLaunchIntent(), i);
            return;
        } else
        {
            throw new AppSwitchNotAvailableException();
        }
    }

}
