// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.util;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.PrettyPrinter;
import org.codehaus.jackson.impl.Indenter;

public class DefaultPrettyPrinter
    implements PrettyPrinter
{

    protected Indenter _arrayIndenter;
    protected int _nesting;
    protected Indenter _objectIndenter;
    protected boolean _spacesInObjectEntries;

    public DefaultPrettyPrinter()
    {
    /* block-local class not found */
    class FixedSpaceIndenter {}

        _arrayIndenter = new FixedSpaceIndenter();
    /* block-local class not found */
    class Lf2SpacesIndenter {}

        _objectIndenter = new Lf2SpacesIndenter();
        _spacesInObjectEntries = true;
        _nesting = 0;
    }

    public void beforeArrayValues(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        _arrayIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void beforeObjectEntries(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        _objectIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void indentArraysWith(Indenter indenter)
    {
        Object obj = indenter;
    /* block-local class not found */
    class NopIndenter {}

        if (indenter == null)
        {
            obj = new NopIndenter();
        }
        _arrayIndenter = ((Indenter) (obj));
    }

    public void indentObjectsWith(Indenter indenter)
    {
        Object obj = indenter;
        if (indenter == null)
        {
            obj = new NopIndenter();
        }
        _objectIndenter = ((Indenter) (obj));
    }

    public void spacesInObjectEntries(boolean flag)
    {
        _spacesInObjectEntries = flag;
    }

    public void writeArrayValueSeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw(',');
        _arrayIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void writeEndArray(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException
    {
        if (!_arrayIndenter.isInline())
        {
            _nesting = _nesting - 1;
        }
        if (i > 0)
        {
            _arrayIndenter.writeIndentation(jsongenerator, _nesting);
        } else
        {
            jsongenerator.writeRaw(' ');
        }
        jsongenerator.writeRaw(']');
    }

    public void writeEndObject(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException
    {
        if (!_objectIndenter.isInline())
        {
            _nesting = _nesting - 1;
        }
        if (i > 0)
        {
            _objectIndenter.writeIndentation(jsongenerator, _nesting);
        } else
        {
            jsongenerator.writeRaw(' ');
        }
        jsongenerator.writeRaw('}');
    }

    public void writeObjectEntrySeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw(',');
        _objectIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        if (_spacesInObjectEntries)
        {
            jsongenerator.writeRaw(" : ");
            return;
        } else
        {
            jsongenerator.writeRaw(':');
            return;
        }
    }

    public void writeRootValueSeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw(' ');
    }

    public void writeStartArray(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        if (!_arrayIndenter.isInline())
        {
            _nesting = _nesting + 1;
        }
        jsongenerator.writeRaw('[');
    }

    public void writeStartObject(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw('{');
        if (!_objectIndenter.isInline())
        {
            _nesting = _nesting + 1;
        }
    }
}
