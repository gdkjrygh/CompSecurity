// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.Permission;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.ec.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.jce.spec.ECParameterSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BouncyCastleProvider

class BouncyCastleProviderConfiguration
    implements ProviderConfiguration
{

    private static Permission BC_DH_LOCAL_PERMISSION;
    private static Permission BC_DH_PERMISSION;
    private static Permission BC_EC_LOCAL_PERMISSION;
    private static Permission BC_EC_PERMISSION;
    private volatile Object dhDefaultParams;
    private ThreadLocal dhThreadSpec;
    private volatile ECParameterSpec ecImplicitCaParams;
    private ThreadLocal ecThreadSpec;

    BouncyCastleProviderConfiguration()
    {
        ecThreadSpec = new ThreadLocal();
        dhThreadSpec = new ThreadLocal();
    }

    public DHParameterSpec getDHDefaultParameters(int i)
    {
        Object obj1 = dhThreadSpec.get();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = dhDefaultParams;
        }
        if (obj instanceof DHParameterSpec)
        {
            obj = (DHParameterSpec)obj;
            if (((DHParameterSpec) (obj)).getP().bitLength() == i)
            {
                return ((DHParameterSpec) (obj));
            }
        } else
        if (obj instanceof DHParameterSpec[])
        {
            DHParameterSpec adhparameterspec[] = (DHParameterSpec[])(DHParameterSpec[])obj;
            for (int j = 0; j != adhparameterspec.length; j++)
            {
                if (adhparameterspec[j].getP().bitLength() == i)
                {
                    return adhparameterspec[j];
                }
            }

        }
        return null;
    }

    public ECParameterSpec getEcImplicitlyCa()
    {
        ECParameterSpec ecparameterspec = (ECParameterSpec)ecThreadSpec.get();
        if (ecparameterspec != null)
        {
            return ecparameterspec;
        } else
        {
            return ecImplicitCaParams;
        }
    }

    void setParameter(String s, Object obj)
    {
        SecurityManager securitymanager = System.getSecurityManager();
        if (!s.equals("threadLocalEcImplicitlyCa")) goto _L2; else goto _L1
_L1:
        if (securitymanager != null)
        {
            securitymanager.checkPermission(BC_EC_LOCAL_PERMISSION);
        }
        if ((obj instanceof ECParameterSpec) || obj == null)
        {
            s = (ECParameterSpec)obj;
        } else
        {
            s = EC5Util.convertSpec((java.security.spec.ECParameterSpec)obj, false);
        }
        if (s != null) goto _L4; else goto _L3
_L3:
        ecThreadSpec.remove();
_L6:
        return;
_L4:
        ecThreadSpec.set(s);
        return;
_L2:
        if (s.equals("ecImplicitlyCa"))
        {
            if (securitymanager != null)
            {
                securitymanager.checkPermission(BC_EC_PERMISSION);
            }
            if ((obj instanceof ECParameterSpec) || obj == null)
            {
                ecImplicitCaParams = (ECParameterSpec)obj;
                return;
            } else
            {
                ecImplicitCaParams = EC5Util.convertSpec((java.security.spec.ECParameterSpec)obj, false);
                return;
            }
        }
        if (s.equals("threadLocalDhDefaultParams"))
        {
            if (securitymanager != null)
            {
                securitymanager.checkPermission(BC_DH_LOCAL_PERMISSION);
            }
            if ((obj instanceof DHParameterSpec) || (obj instanceof DHParameterSpec[]) || obj == null)
            {
                if (obj == null)
                {
                    dhThreadSpec.remove();
                    return;
                } else
                {
                    dhThreadSpec.set(obj);
                    return;
                }
            } else
            {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
        }
        if (s.equals("DhDefaultParams"))
        {
            if (securitymanager != null)
            {
                securitymanager.checkPermission(BC_DH_PERMISSION);
            }
            if ((obj instanceof DHParameterSpec) || (obj instanceof DHParameterSpec[]) || obj == null)
            {
                dhDefaultParams = obj;
                return;
            } else
            {
                throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        BC_EC_LOCAL_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "threadLocalEcImplicitlyCa");
        BC_EC_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "ecImplicitlyCa");
        BC_DH_LOCAL_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "threadLocalDhDefaultParams");
        BC_DH_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "DhDefaultParams");
    }
}
