// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.LazyList;
import com.googlecode.mp4parser.util.Logger;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.googlecode.mp4parser:
//            AbstractContainerBox, AbstractBox

public class BasicContainer
    implements Container, Iterator
{

    private static final Box EOF = new AbstractBox("eof ") {

        protected void _parseDetails(ByteBuffer bytebuffer)
        {
        }

        protected void getContent(ByteBuffer bytebuffer)
        {
        }

        protected long getContentSize()
        {
            return 0L;
        }

    };
    private static Logger LOG = Logger.getLogger(com/googlecode/mp4parser/AbstractContainerBox);
    protected BoxParser boxParser;
    private List boxes;
    long endPosition;
    protected FileChannel fileChannel;
    Box lookahead;
    long parsePosition;
    long startPosition;

    public BasicContainer()
    {
        boxes = new ArrayList();
        lookahead = null;
        parsePosition = 0L;
        startPosition = 0L;
        endPosition = 0L;
    }

    public void addBox(Box box)
    {
        boxes = new ArrayList(getBoxes());
        box.setParent(this);
        boxes.add(box);
    }

    public List getBoxes()
    {
        if (fileChannel != null && lookahead != EOF)
        {
            return new LazyList(boxes, this);
        } else
        {
            return boxes;
        }
    }

    public List getBoxes(Class class1)
    {
        return getBoxes(class1, false);
    }

    public List getBoxes(Class class1, boolean flag)
    {
        ArrayList arraylist = new ArrayList(2);
        Iterator iterator = getBoxes().iterator();
        do
        {
            Box box;
            do
            {
                if (!iterator.hasNext())
                {
                    return arraylist;
                }
                box = (Box)iterator.next();
                if (class1.isInstance(box))
                {
                    arraylist.add(box);
                }
            } while (!flag || !(box instanceof Container));
            arraylist.addAll(((Container)box).getBoxes(class1, flag));
        } while (true);
    }

    public ByteBuffer getByteBuffer(long l, long l1)
        throws IOException
    {
        java.nio.MappedByteBuffer mappedbytebuffer;
        synchronized (fileChannel)
        {
            mappedbytebuffer = fileChannel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, startPosition + l, l1);
        }
        return mappedbytebuffer;
        exception;
        filechannel;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected long getContainerSize()
    {
        long l = 0L;
        int i = 0;
        do
        {
            if (i >= getBoxes().size())
            {
                return l;
            }
            l += ((Box)boxes.get(i)).getSize();
            i++;
        } while (true);
    }

    public boolean hasNext()
    {
        if (lookahead == EOF)
        {
            return false;
        }
        if (lookahead != null)
        {
            return true;
        }
        try
        {
            lookahead = next();
        }
        catch (NoSuchElementException nosuchelementexception)
        {
            lookahead = EOF;
            return false;
        }
        return true;
    }

    public Box next()
    {
        if (lookahead != null && lookahead != EOF)
        {
            Box box = lookahead;
            lookahead = null;
            return box;
        }
        LOG.logDebug("Parsing next() box");
        if (fileChannel == null || parsePosition >= endPosition)
        {
            lookahead = EOF;
            throw new NoSuchElementException();
        }
        Box box1;
        synchronized (fileChannel)
        {
            fileChannel.position(parsePosition);
            box1 = boxParser.parseBox(fileChannel, this);
            parsePosition = fileChannel.position();
        }
        return box1;
        exception;
        filechannel;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (EOFException eofexception)
        {
            throw new NoSuchElementException();
        }
        catch (IOException ioexception)
        {
            throw new NoSuchElementException();
        }
    }

    public volatile Object next()
    {
        return next();
    }

    public void parseContainer(FileChannel filechannel, long l, BoxParser boxparser)
        throws IOException
    {
        fileChannel = filechannel;
        long l1 = filechannel.position();
        startPosition = l1;
        parsePosition = l1;
        filechannel.position(filechannel.position() + l);
        endPosition = filechannel.position();
        boxParser = boxparser;
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    public void setBoxes(List list)
    {
        boxes = new ArrayList(list);
        lookahead = EOF;
        fileChannel = null;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append("[");
        int i = 0;
        do
        {
            if (i >= boxes.size())
            {
                stringbuilder.append("]");
                return stringbuilder.toString();
            }
            if (i > 0)
            {
                stringbuilder.append(";");
            }
            stringbuilder.append(((Box)boxes.get(i)).toString());
            i++;
        } while (true);
    }

    public final void writeContainer(WritableByteChannel writablebytechannel)
        throws IOException
    {
        Iterator iterator = getBoxes().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((Box)iterator.next()).getBox(writablebytechannel);
        } while (true);
    }

}
