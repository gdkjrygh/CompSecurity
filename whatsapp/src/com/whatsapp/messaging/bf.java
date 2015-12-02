// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package com.whatsapp.messaging:
//            h, b_

final class bf
    implements X509TrustManager
{

    private static final String z[];

    bf()
    {
    }

    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
    {
        throw new CertificateException(z[2]);
    }

    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
        int j = h.a;
        s = new Date();
        int k = ax509certificate.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            ax509certificate[i].checkValidity(s);
            i++;
        } while (j == 0);
        CertPathValidator certpathvalidator;
        X509Certificate ax509certificate1[];
        PKIXParameters pkixparameters;
        HashSet hashset;
        try
        {
            certpathvalidator = CertPathValidator.getInstance(z[0]);
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate ax509certificate[])
        {
            throw new CertificateException(ax509certificate);
        }
        ax509certificate = CertificateFactory.getInstance(z[1]).generateCertPath(Arrays.asList(ax509certificate));
        ax509certificate1 = getAcceptedIssuers();
        hashset = new HashSet(ax509certificate1.length);
        k = ax509certificate1.length;
        i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            hashset.add(new TrustAnchor(ax509certificate1[i], null));
            i++;
        } while (j == 0);
        try
        {
            pkixparameters = new PKIXParameters(hashset);
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate ax509certificate[])
        {
            throw new CertificateException(ax509certificate);
        }
        pkixparameters.setDate(s);
        pkixparameters.setRevocationEnabled(false);
        try
        {
            certpathvalidator.validate(ax509certificate, pkixparameters);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate ax509certificate[])
        {
            throw new CertificateException(ax509certificate);
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate ax509certificate[])
        {
            throw new CertificateException(ax509certificate);
        }
    }

    public X509Certificate[] getAcceptedIssuers()
    {
        return b_.b();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "ojR\021";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "g\017.yM";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "qN;*\030VDu=T\\Di=\035YHx(\000Z\001m,\006VGr*\025KHt'TOSt?\035[D\177";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 116;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 63;
          goto _L9
_L5:
        byte0 = 33;
          goto _L9
_L6:
        byte0 = 27;
          goto _L9
        byte0 = 73;
          goto _L9
    }
}
