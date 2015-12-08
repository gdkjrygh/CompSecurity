// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;
import java.net.URL;
import org.codehaus.jackson.format.InputAccessor;
import org.codehaus.jackson.format.MatchStrength;
import org.codehaus.jackson.impl.ByteSourceBootstrapper;
import org.codehaus.jackson.impl.ReaderBasedParser;
import org.codehaus.jackson.impl.Utf8Generator;
import org.codehaus.jackson.impl.WriterBasedGenerator;
import org.codehaus.jackson.io.CharacterEscapes;
import org.codehaus.jackson.io.IOContext;
import org.codehaus.jackson.io.InputDecorator;
import org.codehaus.jackson.io.OutputDecorator;
import org.codehaus.jackson.io.UTF8Writer;
import org.codehaus.jackson.sym.BytesToNameCanonicalizer;
import org.codehaus.jackson.sym.CharsToNameCanonicalizer;
import org.codehaus.jackson.util.BufferRecycler;
import org.codehaus.jackson.util.VersionUtil;

// Referenced classes of package org.codehaus.jackson:
//            Versioned, JsonParseException, JsonEncoding, ObjectCodec, 
//            JsonGenerator, JsonParser, Version

public class JsonFactory
    implements Versioned
{

    static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    public static final String FORMAT_NAME_JSON = "JSON";
    protected static final ThreadLocal _recyclerRef = new ThreadLocal();
    protected CharacterEscapes _characterEscapes;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected ObjectCodec _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected BytesToNameCanonicalizer _rootByteSymbols;
    protected CharsToNameCanonicalizer _rootCharSymbols;

    public JsonFactory()
    {
        this(null);
    }

    public JsonFactory(ObjectCodec objectcodec)
    {
        _rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        _rootByteSymbols = BytesToNameCanonicalizer.createRoot();
        _parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        _generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        _objectCodec = objectcodec;
    }

    protected IOContext _createContext(Object obj, boolean flag)
    {
        return new IOContext(_getBufferRecycler(), obj, flag);
    }

    protected JsonGenerator _createJsonGenerator(Writer writer, IOContext iocontext)
        throws IOException
    {
        writer = new WriterBasedGenerator(iocontext, _generatorFeatures, _objectCodec, writer);
        if (_characterEscapes != null)
        {
            writer.setCharacterEscapes(_characterEscapes);
        }
        return writer;
    }

    protected JsonParser _createJsonParser(InputStream inputstream, IOContext iocontext)
        throws IOException, JsonParseException
    {
        return (new ByteSourceBootstrapper(iocontext, inputstream)).constructParser(_parserFeatures, _objectCodec, _rootByteSymbols, _rootCharSymbols);
    }

    protected JsonParser _createJsonParser(Reader reader, IOContext iocontext)
        throws IOException, JsonParseException
    {
        return new ReaderBasedParser(iocontext, _parserFeatures, reader, _objectCodec, _rootCharSymbols.makeChild(isEnabled(JsonParser.Feature.CANONICALIZE_FIELD_NAMES), isEnabled(JsonParser.Feature.INTERN_FIELD_NAMES)));
    }

    protected JsonParser _createJsonParser(byte abyte0[], int i, int j, IOContext iocontext)
        throws IOException, JsonParseException
    {
        return (new ByteSourceBootstrapper(iocontext, abyte0, i, j)).constructParser(_parserFeatures, _objectCodec, _rootByteSymbols, _rootCharSymbols);
    }

    protected JsonGenerator _createUTF8JsonGenerator(OutputStream outputstream, IOContext iocontext)
        throws IOException
    {
        outputstream = new Utf8Generator(iocontext, _generatorFeatures, _objectCodec, outputstream);
        if (_characterEscapes != null)
        {
            outputstream.setCharacterEscapes(_characterEscapes);
        }
        return outputstream;
    }

    protected Writer _createWriter(OutputStream outputstream, JsonEncoding jsonencoding, IOContext iocontext)
        throws IOException
    {
        if (jsonencoding == JsonEncoding.UTF8)
        {
            return new UTF8Writer(iocontext, outputstream);
        } else
        {
            return new OutputStreamWriter(outputstream, jsonencoding.getJavaName());
        }
    }

    public BufferRecycler _getBufferRecycler()
    {
        Object obj = (SoftReference)_recyclerRef.get();
        Object obj1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (BufferRecycler)((SoftReference) (obj)).get();
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new BufferRecycler();
            _recyclerRef.set(new SoftReference(obj1));
        }
        return ((BufferRecycler) (obj1));
    }

    protected InputStream _optimizedStreamFromURL(URL url)
        throws IOException
    {
        if ("file".equals(url.getProtocol()))
        {
            String s = url.getHost();
            if (s == null || s.length() == 0)
            {
                return new FileInputStream(url.getPath());
            }
        }
        return url.openStream();
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean flag)
    {
        if (flag)
        {
            enable(feature);
            return this;
        } else
        {
            disable(feature);
            return this;
        }
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean flag)
    {
        if (flag)
        {
            enable(feature);
            return this;
        } else
        {
            disable(feature);
            return this;
        }
    }

    public JsonGenerator createJsonGenerator(File file, JsonEncoding jsonencoding)
        throws IOException
    {
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        IOContext iocontext = _createContext(fileoutputstream, true);
        iocontext.setEncoding(jsonencoding);
        if (jsonencoding == JsonEncoding.UTF8)
        {
            file = fileoutputstream;
            if (_outputDecorator != null)
            {
                file = _outputDecorator.decorate(iocontext, fileoutputstream);
            }
            return _createUTF8JsonGenerator(file, iocontext);
        }
        jsonencoding = _createWriter(fileoutputstream, jsonencoding, iocontext);
        file = jsonencoding;
        if (_outputDecorator != null)
        {
            file = _outputDecorator.decorate(iocontext, jsonencoding);
        }
        return _createJsonGenerator(file, iocontext);
    }

    public JsonGenerator createJsonGenerator(OutputStream outputstream)
        throws IOException
    {
        return createJsonGenerator(outputstream, JsonEncoding.UTF8);
    }

    public JsonGenerator createJsonGenerator(OutputStream outputstream, JsonEncoding jsonencoding)
        throws IOException
    {
        IOContext iocontext = _createContext(outputstream, false);
        iocontext.setEncoding(jsonencoding);
        if (jsonencoding == JsonEncoding.UTF8)
        {
            jsonencoding = outputstream;
            if (_outputDecorator != null)
            {
                jsonencoding = _outputDecorator.decorate(iocontext, outputstream);
            }
            return _createUTF8JsonGenerator(jsonencoding, iocontext);
        }
        jsonencoding = _createWriter(outputstream, jsonencoding, iocontext);
        outputstream = jsonencoding;
        if (_outputDecorator != null)
        {
            outputstream = _outputDecorator.decorate(iocontext, jsonencoding);
        }
        return _createJsonGenerator(outputstream, iocontext);
    }

    public JsonGenerator createJsonGenerator(Writer writer)
        throws IOException
    {
        IOContext iocontext = _createContext(writer, false);
        Writer writer1 = writer;
        if (_outputDecorator != null)
        {
            writer1 = _outputDecorator.decorate(iocontext, writer);
        }
        return _createJsonGenerator(writer1, iocontext);
    }

    public JsonParser createJsonParser(File file)
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(file, true);
        FileInputStream fileinputstream = new FileInputStream(file);
        file = fileinputstream;
        if (_inputDecorator != null)
        {
            file = _inputDecorator.decorate(iocontext, fileinputstream);
        }
        return _createJsonParser(file, iocontext);
    }

    public JsonParser createJsonParser(InputStream inputstream)
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(inputstream, false);
        InputStream inputstream1 = inputstream;
        if (_inputDecorator != null)
        {
            inputstream1 = _inputDecorator.decorate(iocontext, inputstream);
        }
        return _createJsonParser(inputstream1, iocontext);
    }

    public JsonParser createJsonParser(Reader reader)
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(reader, false);
        Reader reader1 = reader;
        if (_inputDecorator != null)
        {
            reader1 = _inputDecorator.decorate(iocontext, reader);
        }
        return _createJsonParser(reader1, iocontext);
    }

    public JsonParser createJsonParser(String s)
        throws IOException, JsonParseException
    {
        StringReader stringreader = new StringReader(s);
        IOContext iocontext = _createContext(stringreader, true);
        s = stringreader;
        if (_inputDecorator != null)
        {
            s = _inputDecorator.decorate(iocontext, stringreader);
        }
        return _createJsonParser(s, iocontext);
    }

    public JsonParser createJsonParser(URL url)
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(url, true);
        InputStream inputstream = _optimizedStreamFromURL(url);
        url = inputstream;
        if (_inputDecorator != null)
        {
            url = _inputDecorator.decorate(iocontext, inputstream);
        }
        return _createJsonParser(url, iocontext);
    }

    public JsonParser createJsonParser(byte abyte0[])
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(abyte0, true);
        if (_inputDecorator != null)
        {
            InputStream inputstream = _inputDecorator.decorate(iocontext, abyte0, 0, abyte0.length);
            if (inputstream != null)
            {
                return _createJsonParser(inputstream, iocontext);
            }
        }
        return _createJsonParser(abyte0, 0, abyte0.length, iocontext);
    }

    public JsonParser createJsonParser(byte abyte0[], int i, int j)
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(abyte0, true);
        if (_inputDecorator != null)
        {
            InputStream inputstream = _inputDecorator.decorate(iocontext, abyte0, i, j);
            if (inputstream != null)
            {
                return _createJsonParser(inputstream, iocontext);
            }
        }
        return _createJsonParser(abyte0, i, j, iocontext);
    }

    public JsonFactory disable(JsonGenerator.Feature feature)
    {
        _generatorFeatures = _generatorFeatures & ~feature.getMask();
        return this;
    }

    public JsonFactory disable(JsonParser.Feature feature)
    {
        _parserFeatures = _parserFeatures & ~feature.getMask();
        return this;
    }

    public final void disableGeneratorFeature(JsonGenerator.Feature feature)
    {
        disable(feature);
    }

    public final void disableParserFeature(JsonParser.Feature feature)
    {
        disable(feature);
    }

    public JsonFactory enable(JsonGenerator.Feature feature)
    {
        _generatorFeatures = _generatorFeatures | feature.getMask();
        return this;
    }

    public JsonFactory enable(JsonParser.Feature feature)
    {
        _parserFeatures = _parserFeatures | feature.getMask();
        return this;
    }

    public final void enableGeneratorFeature(JsonGenerator.Feature feature)
    {
        enable(feature);
    }

    public final void enableParserFeature(JsonParser.Feature feature)
    {
        enable(feature);
    }

    public CharacterEscapes getCharacterEscapes()
    {
        return _characterEscapes;
    }

    public ObjectCodec getCodec()
    {
        return _objectCodec;
    }

    public String getFormatName()
    {
        if (getClass() == org/codehaus/jackson/JsonFactory)
        {
            return "JSON";
        } else
        {
            return null;
        }
    }

    public InputDecorator getInputDecorator()
    {
        return _inputDecorator;
    }

    public OutputDecorator getOutputDecorator()
    {
        return _outputDecorator;
    }

    public MatchStrength hasFormat(InputAccessor inputaccessor)
        throws IOException
    {
        if (getClass() == org/codehaus/jackson/JsonFactory)
        {
            return hasJSONFormat(inputaccessor);
        } else
        {
            return null;
        }
    }

    protected MatchStrength hasJSONFormat(InputAccessor inputaccessor)
        throws IOException
    {
        return ByteSourceBootstrapper.hasJSONFormat(inputaccessor);
    }

    public final boolean isEnabled(JsonGenerator.Feature feature)
    {
        return (_generatorFeatures & feature.getMask()) != 0;
    }

    public final boolean isEnabled(JsonParser.Feature feature)
    {
        return (_parserFeatures & feature.getMask()) != 0;
    }

    public final boolean isGeneratorFeatureEnabled(JsonGenerator.Feature feature)
    {
        return isEnabled(feature);
    }

    public final boolean isParserFeatureEnabled(JsonParser.Feature feature)
    {
        return (_parserFeatures & feature.getMask()) != 0;
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterescapes)
    {
        _characterEscapes = characterescapes;
        return this;
    }

    public JsonFactory setCodec(ObjectCodec objectcodec)
    {
        _objectCodec = objectcodec;
        return this;
    }

    public final void setGeneratorFeature(JsonGenerator.Feature feature, boolean flag)
    {
        configure(feature, flag);
    }

    public JsonFactory setInputDecorator(InputDecorator inputdecorator)
    {
        _inputDecorator = inputdecorator;
        return this;
    }

    public JsonFactory setOutputDecorator(OutputDecorator outputdecorator)
    {
        _outputDecorator = outputdecorator;
        return this;
    }

    public final void setParserFeature(JsonParser.Feature feature, boolean flag)
    {
        configure(feature, flag);
    }

    public Version version()
    {
        return VersionUtil.versionFor(org/codehaus/jackson/impl/Utf8Generator);
    }

}
