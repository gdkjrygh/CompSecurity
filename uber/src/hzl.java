// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class hzl
    implements hzw
{

    private final hzw _flddelegate;

    public hzl(hzw hzw1)
    {
        if (hzw1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            _flddelegate = hzw1;
            return;
        }
    }

    public void close()
    {
        _flddelegate.close();
    }

    public final hzw _mthdelegate()
    {
        return _flddelegate;
    }

    public long read(hzf hzf, long l)
    {
        return _flddelegate.read(hzf, l);
    }

    public hzx timeout()
    {
        return _flddelegate.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(_flddelegate.toString()).append(")").toString();
    }
}
