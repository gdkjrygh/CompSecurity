// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.test;


// Referenced classes of package org.bouncycastle.util.test:
//            TestResult

public class TestFailedException extends RuntimeException
{

    private TestResult _result;

    public TestFailedException(TestResult testresult)
    {
        _result = testresult;
    }

    public TestResult getResult()
    {
        return _result;
    }
}
