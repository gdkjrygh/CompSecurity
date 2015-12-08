// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.util;


public abstract class PrimitiveArrayBuilder
{

    static final int INITIAL_CHUNK_SIZE = 12;
    static final int MAX_CHUNK_SIZE = 0x40000;
    static final int SMALL_CHUNK_SIZE = 16384;
    Node _bufferHead;
    Node _bufferTail;
    int _bufferedEntryCount;
    Object _freeBuffer;

    protected PrimitiveArrayBuilder()
    {
    }

    protected abstract Object _constructArray(int i);

    protected void _reset()
    {
    /* block-local class not found */
    class Node {}

        if (_bufferTail != null)
        {
            _freeBuffer = _bufferTail.getData();
        }
        _bufferTail = null;
        _bufferHead = null;
        _bufferedEntryCount = 0;
    }

    public final Object appendCompletedChunk(Object obj, int i)
    {
        obj = new Node(obj, i);
        if (_bufferHead == null)
        {
            _bufferTail = ((Node) (obj));
            _bufferHead = ((Node) (obj));
        } else
        {
            _bufferTail.linkNext(((Node) (obj)));
            _bufferTail = ((Node) (obj));
        }
        _bufferedEntryCount = _bufferedEntryCount + i;
        if (i < 16384)
        {
            i += i;
        } else
        {
            i += i >> 2;
        }
        return _constructArray(i);
    }

    public Object completeAndClearBuffer(Object obj, int i)
    {
        int k = i + _bufferedEntryCount;
        Object obj1 = _constructArray(k);
        int j = 0;
        for (Node node = _bufferHead; node != null; node = node.next())
        {
            j = node.copyData(obj1, j);
        }

        System.arraycopy(obj, 0, obj1, j, i);
        i = j + i;
        if (i != k)
        {
            throw new IllegalStateException((new StringBuilder()).append("Should have gotten ").append(k).append(" entries, got ").append(i).toString());
        } else
        {
            return obj1;
        }
    }

    public Object resetAndStart()
    {
        _reset();
        if (_freeBuffer == null)
        {
            return _constructArray(12);
        } else
        {
            return _freeBuffer;
        }
    }
}
