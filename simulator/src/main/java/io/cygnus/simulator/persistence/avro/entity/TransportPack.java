/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.cygnus.simulator.persistence.avro.entity;

import java.util.Optional;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
@org.apache.avro.specific.AvroGenerated
public class TransportPack extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -748119987840780807L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TransportPack\",\"namespace\":\"io.cygnus.simulator.persistence.avro.entity\",\"fields\":[{\"name\":\"title\",\"type\":{\"type\":\"enum\",\"name\":\"PackTitle\",\"symbols\":[\"MarketDataSubscribe\",\"MarketDataLevel1\",\"SimOrder\",\"Next\"]}},{\"name\":\"content\",\"type\":\"bytes\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TransportPack> ENCODER =
      new BinaryMessageEncoder<TransportPack>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TransportPack> DECODER =
      new BinaryMessageDecoder<TransportPack>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TransportPack> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TransportPack> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TransportPack> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TransportPack>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TransportPack to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TransportPack from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TransportPack instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TransportPack fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private io.cygnus.simulator.persistence.avro.entity.PackTitle title;
   private java.nio.ByteBuffer content;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TransportPack() {}

  /**
   * All-args constructor.
   * @param title The new value for title
   * @param content The new value for content
   */
  public TransportPack(io.cygnus.simulator.persistence.avro.entity.PackTitle title, java.nio.ByteBuffer content) {
    this.title = title;
    this.content = content;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return title;
    case 1: return content;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: title = (io.cygnus.simulator.persistence.avro.entity.PackTitle)value$; break;
    case 1: content = (java.nio.ByteBuffer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'title' field.
   * @return The value of the 'title' field.
   */
  public io.cygnus.simulator.persistence.avro.entity.PackTitle getTitle() {
    return title;
  }

  /**
   * Gets the value of the 'title' field as an Optional&lt;io.cygnus.simulator.persistence.avro.entity.PackTitle&gt;.
   * @return The value wrapped in an Optional&lt;io.cygnus.simulator.persistence.avro.entity.PackTitle&gt;.
   */
  public Optional<io.cygnus.simulator.persistence.avro.entity.PackTitle> getOptionalTitle() {
    return Optional.<io.cygnus.simulator.persistence.avro.entity.PackTitle>ofNullable(title);
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(io.cygnus.simulator.persistence.avro.entity.PackTitle value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'content' field.
   * @return The value of the 'content' field.
   */
  public java.nio.ByteBuffer getContent() {
    return content;
  }

  /**
   * Gets the value of the 'content' field as an Optional&lt;java.nio.ByteBuffer&gt;.
   * @return The value wrapped in an Optional&lt;java.nio.ByteBuffer&gt;.
   */
  public Optional<java.nio.ByteBuffer> getOptionalContent() {
    return Optional.<java.nio.ByteBuffer>ofNullable(content);
  }

  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(java.nio.ByteBuffer value) {
    this.content = value;
  }

  /**
   * Creates a new TransportPack RecordBuilder.
   * @return A new TransportPack RecordBuilder
   */
  public static io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder newBuilder() {
    return new io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder();
  }

  /**
   * Creates a new TransportPack RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TransportPack RecordBuilder
   */
  public static io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder newBuilder(io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder other) {
    if (other == null) {
      return new io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder();
    } else {
      return new io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder(other);
    }
  }

  /**
   * Creates a new TransportPack RecordBuilder by copying an existing TransportPack instance.
   * @param other The existing instance to copy.
   * @return A new TransportPack RecordBuilder
   */
  public static io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder newBuilder(io.cygnus.simulator.persistence.avro.entity.TransportPack other) {
    if (other == null) {
      return new io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder();
    } else {
      return new io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder(other);
    }
  }

  /**
   * RecordBuilder for TransportPack instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TransportPack>
    implements org.apache.avro.data.RecordBuilder<TransportPack> {

    private io.cygnus.simulator.persistence.avro.entity.PackTitle title;
    private java.nio.ByteBuffer content;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.content)) {
        this.content = data().deepCopy(fields()[1].schema(), other.content);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing TransportPack instance
     * @param other The existing instance to copy.
     */
    private Builder(io.cygnus.simulator.persistence.avro.entity.TransportPack other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.content)) {
        this.content = data().deepCopy(fields()[1].schema(), other.content);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'title' field.
      * @return The value.
      */
    public io.cygnus.simulator.persistence.avro.entity.PackTitle getTitle() {
      return title;
    }

    /**
      * Gets the value of the 'title' field as an Optional&lt;io.cygnus.simulator.persistence.avro.entity.PackTitle&gt;.
      * @return The value wrapped in an Optional&lt;io.cygnus.simulator.persistence.avro.entity.PackTitle&gt;.
      */
    public Optional<io.cygnus.simulator.persistence.avro.entity.PackTitle> getOptionalTitle() {
      return Optional.<io.cygnus.simulator.persistence.avro.entity.PackTitle>ofNullable(title);
    }

    /**
      * Sets the value of the 'title' field.
      * @param value The value of 'title'.
      * @return This builder.
      */
    public io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder setTitle(io.cygnus.simulator.persistence.avro.entity.PackTitle value) {
      validate(fields()[0], value);
      this.title = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder clearTitle() {
      title = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'content' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getContent() {
      return content;
    }

    /**
      * Gets the value of the 'content' field as an Optional&lt;java.nio.ByteBuffer&gt;.
      * @return The value wrapped in an Optional&lt;java.nio.ByteBuffer&gt;.
      */
    public Optional<java.nio.ByteBuffer> getOptionalContent() {
      return Optional.<java.nio.ByteBuffer>ofNullable(content);
    }

    /**
      * Sets the value of the 'content' field.
      * @param value The value of 'content'.
      * @return This builder.
      */
    public io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder setContent(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.content = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'content' field has been set.
      * @return True if the 'content' field has been set, false otherwise.
      */
    public boolean hasContent() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'content' field.
      * @return This builder.
      */
    public io.cygnus.simulator.persistence.avro.entity.TransportPack.Builder clearContent() {
      content = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public TransportPack build() {
      try {
        TransportPack record = new TransportPack();
        record.title = fieldSetFlags()[0] ? this.title : (io.cygnus.simulator.persistence.avro.entity.PackTitle) defaultValue(fields()[0]);
        record.content = fieldSetFlags()[1] ? this.content : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TransportPack>
    WRITER$ = (org.apache.avro.io.DatumWriter<TransportPack>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TransportPack>
    READER$ = (org.apache.avro.io.DatumReader<TransportPack>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeEnum(this.title.ordinal());

    out.writeBytes(this.content);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.title = io.cygnus.simulator.persistence.avro.entity.PackTitle.values()[in.readEnum()];

      this.content = in.readBytes(this.content);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.title = io.cygnus.simulator.persistence.avro.entity.PackTitle.values()[in.readEnum()];
          break;

        case 1:
          this.content = in.readBytes(this.content);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










