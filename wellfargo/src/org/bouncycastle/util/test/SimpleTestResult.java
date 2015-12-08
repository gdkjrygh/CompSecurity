// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.test;


// Referenced classes of package org.bouncycastle.util.test:
//            TestResult, Test

public class SimpleTestResult
    implements TestResult
{

    private static final String SEPARATOR = System.getProperty("line.separator");
    private Throwable exception;
    private String message;
    private boolean success;

    public SimpleTestResult(boolean flag, String s)
    {
        success = flag;
        message = s;
    }

    public SimpleTestResult(boolean flag, String s, Throwable throwable)
    {
        success = flag;
        message = s;
        exception = throwable;
    }

    public static TestResult failed(Test test, String s)
    {
        return new SimpleTestResult(false, (new StringBuilder()).append(test.getName()).append(": ").append(s).toString());
    }

    public static TestResult failed(Test test, String s, Object obj, Object obj1)
    {
        return failed(test, (new StringBuilder()).append(s).append(SEPARATOR).append("Expected: ").append(obj).append(SEPARATOR).append("Found   : ").append(obj1).toString());
    }

    public static TestResult failed(Test test, String s, Throwable throwable)
    {
        return new SimpleTestResult(false, (new StringBuilder()).append(test.getName()).append(": ").append(s).toString(), throwable);
    }

    public static String failedMessage(String s, String s1, String s2, String s3)
    {
        s = new StringBuffer(s);
        s.append(" failing ").append(s1);
        s.append(SEPARATOR).append("    expected: ").append(s2);
        s.append(SEPARATOR).append("    got     : ").append(s3);
        return s.toString();
    }

    public static TestResult successful(Test test, String s)
    {
        return new SimpleTestResult(true, (new StringBuilder()).append(test.getName()).append(": ").append(s).toString());
    }

    public Throwable getException()
    {
        return exception;
    }

    public boolean isSuccessful()
    {
        return success;
    }

    public String toString()
    {
        return message;
    }

}
