/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.avro.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OrderEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1705846656411312475L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderEvent\",\"namespace\":\"com.example.avro.schema\",\"fields\":[{\"name\":\"item\",\"type\":\"string\"},{\"name\":\"amount\",\"type\":\"double\"}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrderEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrderEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrderEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrderEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrderEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrderEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OrderEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence item;
  private double amount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderEvent() {}

  /**
   * All-args constructor.
   * @param item The new value for item
   * @param amount The new value for amount
   */
  public OrderEvent(java.lang.CharSequence item, java.lang.Double amount) {
    this.item = item;
    this.amount = amount;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  @JsonIgnore
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return item;
    case 1: return amount;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: item = (java.lang.CharSequence)value$; break;
    case 1: amount = (java.lang.Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'item' field.
   * @return The value of the 'item' field.
   */
  public java.lang.CharSequence getItem() {
    return item;
  }


  /**
   * Sets the value of the 'item' field.
   * @param value the value to set.
   */
  public void setItem(java.lang.CharSequence value) {
    this.item = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public double getAmount() {
    return amount;
  }


  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(double value) {
    this.amount = value;
  }

  /**
   * Creates a new OrderEvent RecordBuilder.
   * @return A new OrderEvent RecordBuilder
   */
  public static com.example.avro.schema.OrderEvent.Builder newBuilder() {
    return new com.example.avro.schema.OrderEvent.Builder();
  }

  /**
   * Creates a new OrderEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderEvent RecordBuilder
   */
  public static com.example.avro.schema.OrderEvent.Builder newBuilder(com.example.avro.schema.OrderEvent.Builder other) {
    if (other == null) {
      return new com.example.avro.schema.OrderEvent.Builder();
    } else {
      return new com.example.avro.schema.OrderEvent.Builder(other);
    }
  }

  /**
   * Creates a new OrderEvent RecordBuilder by copying an existing OrderEvent instance.
   * @param other The existing instance to copy.
   * @return A new OrderEvent RecordBuilder
   */
  public static com.example.avro.schema.OrderEvent.Builder newBuilder(com.example.avro.schema.OrderEvent other) {
    if (other == null) {
      return new com.example.avro.schema.OrderEvent.Builder();
    } else {
      return new com.example.avro.schema.OrderEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrderEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderEvent>
    implements org.apache.avro.data.RecordBuilder<OrderEvent> {

    private java.lang.CharSequence item;
    private double amount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.avro.schema.OrderEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.item)) {
        this.item = data().deepCopy(fields()[0].schema(), other.item);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.amount)) {
        this.amount = data().deepCopy(fields()[1].schema(), other.amount);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing OrderEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.avro.schema.OrderEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.item)) {
        this.item = data().deepCopy(fields()[0].schema(), other.item);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.amount)) {
        this.amount = data().deepCopy(fields()[1].schema(), other.amount);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'item' field.
      * @return The value.
      */
    public java.lang.CharSequence getItem() {
      return item;
    }


    /**
      * Sets the value of the 'item' field.
      * @param value The value of 'item'.
      * @return This builder.
      */
    public com.example.avro.schema.OrderEvent.Builder setItem(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.item = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'item' field has been set.
      * @return True if the 'item' field has been set, false otherwise.
      */
    public boolean hasItem() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'item' field.
      * @return This builder.
      */
    public com.example.avro.schema.OrderEvent.Builder clearItem() {
      item = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public double getAmount() {
      return amount;
    }


    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public com.example.avro.schema.OrderEvent.Builder setAmount(double value) {
      validate(fields()[1], value);
      this.amount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public com.example.avro.schema.OrderEvent.Builder clearAmount() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderEvent build() {
      try {
        OrderEvent record = new OrderEvent();
        record.item = fieldSetFlags()[0] ? this.item : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.amount = fieldSetFlags()[1] ? this.amount : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderEvent>
    READER$ = (org.apache.avro.io.DatumReader<OrderEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.item);

    out.writeDouble(this.amount);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.item = in.readString(this.item instanceof Utf8 ? (Utf8)this.item : null);

      this.amount = in.readDouble();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.item = in.readString(this.item instanceof Utf8 ? (Utf8)this.item : null);
          break;

        case 1:
          this.amount = in.readDouble();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










