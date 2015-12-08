// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider;

import java.security.AccessController;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

public class BouncyCastlePQCProvider extends Provider
    implements ConfigurableProvider
{

    private static final String ALGORITHMS[] = {
        "Rainbow", "McEliece"
    };
    private static final String ALGORITHM_PACKAGE = "org.bouncycastle.pqc.jcajce.provider.";
    public static final ProviderConfiguration CONFIGURATION = null;
    public static String PROVIDER_NAME = "BCPQC";
    private static String info = "BouncyCastle Post-Quantum Security Provider v1.48";
    private static final Map keyInfoConverters = new HashMap();

    public BouncyCastlePQCProvider()
    {
        super(PROVIDER_NAME, 1.48D, info);
        AccessController.doPrivileged(new _cls1());
    }

    public static PrivateKey getPrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        AsymmetricKeyInfoConverter asymmetrickeyinfoconverter = (AsymmetricKeyInfoConverter)keyInfoConverters.get(privatekeyinfo.getPrivateKeyAlgorithm().getAlgorithm());
        if (asymmetrickeyinfoconverter == null)
        {
            return null;
        } else
        {
            return asymmetrickeyinfoconverter.generatePrivate(privatekeyinfo);
        }
    }

    public static PublicKey getPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        AsymmetricKeyInfoConverter asymmetrickeyinfoconverter = (AsymmetricKeyInfoConverter)keyInfoConverters.get(subjectpublickeyinfo.getAlgorithm().getAlgorithm());
        if (asymmetrickeyinfoconverter == null)
        {
            return null;
        } else
        {
            return asymmetrickeyinfoconverter.generatePublic(subjectpublickeyinfo);
        }
    }

    private void loadAlgorithms(String s, String as[])
    {
        int i = 0;
_L5:
        if (i == as.length) goto _L2; else goto _L1
_L1:
        Class class1 = null;
        Object obj = getClass().getClassLoader();
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((ClassLoader) (obj)).loadClass((new StringBuilder()).append(s).append(as[i]).append("$Mappings").toString());
        class1 = ((Class) (obj));
_L6:
        Class class2;
        if (class1 != null)
        {
            try
            {
                ((AlgorithmProvider)class1.newInstance()).configure(this);
            }
            catch (Exception exception)
            {
                throw new InternalError((new StringBuilder()).append("cannot create instance of ").append(s).append(as[i]).append("$Mappings : ").append(exception).toString());
            }
        }
        i++;
          goto _L5
_L4:
        class2 = Class.forName((new StringBuilder()).append(s).append(as[i]).append("$Mappings").toString());
        class1 = class2;
          goto _L6
_L2:
        return;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
          goto _L6
    }

    private void setup()
    {
        loadAlgorithms("org.bouncycastle.pqc.jcajce.provider.", ALGORITHMS);
    }

    public void addAlgorithm(String s, String s1)
    {
        if (containsKey(s))
        {
            throw new IllegalStateException((new StringBuilder()).append("duplicate provider key (").append(s).append(") found").toString());
        } else
        {
            put(s, s1);
            return;
        }
    }

    public void addKeyInfoConverter(ASN1ObjectIdentifier asn1objectidentifier, AsymmetricKeyInfoConverter asymmetrickeyinfoconverter)
    {
        keyInfoConverters.put(asn1objectidentifier, asymmetrickeyinfoconverter);
    }

    public boolean hasAlgorithm(String s, String s1)
    {
        return containsKey((new StringBuilder()).append(s).append(".").append(s1).toString()) || containsKey((new StringBuilder()).append("Alg.Alias.").append(s).append(".").append(s1).toString());
    }

    public void setParameter(String s, Object obj)
    {
        synchronized (CONFIGURATION) { }
        return;
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
    }



    private class _cls1
        implements PrivilegedAction
    {

        final BouncyCastlePQCProvider this$0;

        public Object run()
        {
            setup();
            return null;
        }

        _cls1()
        {
            this$0 = BouncyCastlePQCProvider.this;
            super();
        }
    }

}
