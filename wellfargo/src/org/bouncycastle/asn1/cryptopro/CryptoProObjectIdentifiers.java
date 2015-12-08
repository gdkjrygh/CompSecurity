// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cryptopro;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface CryptoProObjectIdentifiers
{

    public static final ASN1ObjectIdentifier GOST_id = new ASN1ObjectIdentifier("1.2.643.2.2");
    public static final ASN1ObjectIdentifier gostR28147_cbc = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".21").toString());
    public static final ASN1ObjectIdentifier gostR3410_2001 = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".19").toString());
    public static final ASN1ObjectIdentifier gostR3410_2001_CryptoPro_A = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".35.1").toString());
    public static final ASN1ObjectIdentifier gostR3410_2001_CryptoPro_B = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".35.2").toString());
    public static final ASN1ObjectIdentifier gostR3410_2001_CryptoPro_C = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".35.3").toString());
    public static final ASN1ObjectIdentifier gostR3410_2001_CryptoPro_XchA = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".36.0").toString());
    public static final ASN1ObjectIdentifier gostR3410_2001_CryptoPro_XchB = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".36.1").toString());
    public static final ASN1ObjectIdentifier gostR3410_94 = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".20").toString());
    public static final ASN1ObjectIdentifier gostR3410_94_CryptoPro_A = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".32.2").toString());
    public static final ASN1ObjectIdentifier gostR3410_94_CryptoPro_B = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".32.3").toString());
    public static final ASN1ObjectIdentifier gostR3410_94_CryptoPro_C = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".32.4").toString());
    public static final ASN1ObjectIdentifier gostR3410_94_CryptoPro_D = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".32.5").toString());
    public static final ASN1ObjectIdentifier gostR3410_94_CryptoPro_XchA = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".33.1").toString());
    public static final ASN1ObjectIdentifier gostR3410_94_CryptoPro_XchB = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".33.2").toString());
    public static final ASN1ObjectIdentifier gostR3410_94_CryptoPro_XchC = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".33.3").toString());
    public static final ASN1ObjectIdentifier gostR3411 = GOST_id.branch("9");
    public static final ASN1ObjectIdentifier gostR3411Hmac = GOST_id.branch("10");
    public static final ASN1ObjectIdentifier gostR3411_94_CryptoProParamSet = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".30.1").toString());
    public static final ASN1ObjectIdentifier gostR3411_94_with_gostR3410_2001 = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".3").toString());
    public static final ASN1ObjectIdentifier gostR3411_94_with_gostR3410_94 = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".4").toString());
    public static final ASN1ObjectIdentifier gost_ElSgDH3410_1 = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".36.1").toString());
    public static final ASN1ObjectIdentifier gost_ElSgDH3410_default = new ASN1ObjectIdentifier((new StringBuilder()).append(GOST_id).append(".36.0").toString());
    public static final ASN1ObjectIdentifier id_Gost28147_89_CryptoPro_A_ParamSet = GOST_id.branch("31.1");

}
