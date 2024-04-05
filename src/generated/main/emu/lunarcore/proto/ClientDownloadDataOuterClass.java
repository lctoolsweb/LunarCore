package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedByte;

public final class ClientDownloadDataOuterClass {
    public ClientDownloadDataOuterClass() {
    }

    public static final class ClientDownloadData extends ProtoMessage<ClientDownloadData> implements Cloneable {
        private static final long serialVersionUID = 0L;
        private long time;
        private int version;
        private final RepeatedByte data = RepeatedByte.newEmptyInstance();

        private ClientDownloadData() {
        }

        public static ClientDownloadData newInstance() {
            return new ClientDownloadData();
        }

        public boolean hasTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public ClientDownloadData clearTime() {
            this.bitField0_ &= -2;
            this.time = 0L;
            return this;
        }

        public long getTime() {
            return this.time;
        }

        public ClientDownloadData setTime(long value) {
            this.bitField0_ |= 1;
            this.time = value;
            return this;
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public ClientDownloadData clearVersion() {
            this.bitField0_ &= -3;
            this.version = 0;
            return this;
        }

        public int getVersion() {
            return this.version;
        }

        public ClientDownloadData setVersion(int value) {
            this.bitField0_ |= 2;
            this.version = value;
            return this;
        }

        public boolean hasData() {
            return (this.bitField0_ & 4) != 0;
        }

        public ClientDownloadData clearData() {
            this.bitField0_ &= -5;
            this.data.clear();
            return this;
        }

        public RepeatedByte getData() {
            return this.data;
        }

        public RepeatedByte getMutableData() {
            this.bitField0_ |= 4;
            return this.data;
        }

        public ClientDownloadData addData(byte value) {
            this.bitField0_ |= 4;
            this.data.add(value);
            return this;
        }

        public ClientDownloadData addAllData(byte... values) {
            this.bitField0_ |= 4;
            this.data.addAll(values);
            return this;
        }

        public ClientDownloadData setData(byte... values) {
            this.bitField0_ |= 4;
            this.data.copyFrom(values);
            return this;
        }

        public ClientDownloadData copyFrom(ClientDownloadData other) {
            this.cachedSize = other.cachedSize;
            if ((this.bitField0_ | other.bitField0_) != 0) {
                this.bitField0_ = other.bitField0_;
                this.time = other.time;
                this.version = other.version;
                this.data.copyFrom(other.data);
            }

            return this;
        }

        public ClientDownloadData mergeFrom(ClientDownloadData other) {
            if (other.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                if (other.hasTime()) {
                    this.setTime(other.time);
                }

                if (other.hasVersion()) {
                    this.setVersion(other.version);
                }

                if (other.hasData()) {
                    this.getMutableData().copyFrom(other.data);
                }

                return this;
            }
        }

        public ClientDownloadData clear() {
            if (this.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                this.bitField0_ = 0;
                this.time = 0L;
                this.version = 0;
                this.data.clear();
                return this;
            }
        }

        public ClientDownloadData clearQuick() {
            if (this.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                this.bitField0_ = 0;
                this.data.clear();
                return this;
            }
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof ClientDownloadData)) {
                return false;
            } else {
                ClientDownloadData other = (ClientDownloadData)o;
                return this.bitField0_ == other.bitField0_ && (!this.hasTime() || this.time == other.time) && (!this.hasVersion() || this.version == other.version) && (!this.hasData() || this.data.equals(other.data));
            }
        }

        public void writeTo(ProtoSink output) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                output.writeRawByte((byte)16);
                output.writeInt64NoTag(this.time);
            }

            if ((this.bitField0_ & 2) != 0) {
                output.writeRawByte((byte)8);
                output.writeUInt32NoTag(this.version);
            }

            if ((this.bitField0_ & 4) != 0) {
                output.writeRawByte((byte)26);
                output.writeBytesNoTag(this.data);
            }

        }

        protected int computeSerializedSize() {
            int size = 0;
            if ((this.bitField0_ & 1) != 0) {
                size += 1 + ProtoSink.computeInt64SizeNoTag(this.time);
            }

            if ((this.bitField0_ & 2) != 0) {
                size += 1 + ProtoSink.computeUInt32SizeNoTag(this.version);
            }

            if ((this.bitField0_ & 4) != 0) {
                size += 1 + ProtoSink.computeBytesSizeNoTag(this.data);
            }

            return size;
        }

        public ClientDownloadData mergeFrom(ProtoSource input) throws IOException {
            int tag = input.readTag();

            while(true) {
                switch (tag) {
                    case 0:
                        return this;
                    case 16:
                        this.time = input.readInt64();
                        this.bitField0_ |= 1;
                        tag = input.readTag();
                        if (tag != 8) {
                            break;
                        }
                    case 8:
                        this.version = input.readUInt32();
                        this.bitField0_ |= 2;
                        tag = input.readTag();
                        if (tag != 26) {
                            break;
                        }
                    case 26:
                        input.readBytes(this.data);
                        this.bitField0_ |= 4;
                        tag = input.readTag();
                        if (tag != 0) {
                            break;
                        }

                        return this;
                    default:
                        if (!input.skipField(tag)) {
                            return this;
                        }

                        tag = input.readTag();
                }
            }
        }

        public void writeTo(JsonSink output) throws IOException {
            output.beginObject();
            if ((this.bitField0_ & 1) != 0) {
                output.writeInt64(ClientDownloadDataOuterClass.ClientDownloadData.FieldNames.time, this.time);
            }

            if ((this.bitField0_ & 2) != 0) {
                output.writeUInt32(ClientDownloadDataOuterClass.ClientDownloadData.FieldNames.version, this.version);
            }

            if ((this.bitField0_ & 4) != 0) {
                output.writeBytes(ClientDownloadDataOuterClass.ClientDownloadData.FieldNames.data, this.data);
            }

            output.endObject();
        }

        public ClientDownloadData mergeFrom(JsonSource input) throws IOException {
            if (!input.beginObject()) {
                return this;
            } else {
                while(!input.isAtEnd()) {
                    switch (input.readFieldHash()) {
                        case 3076010:
                            if (input.isAtField(ClientDownloadDataOuterClass.ClientDownloadData.FieldNames.data)) {
                                if (!input.trySkipNullValue()) {
                                    input.readBytes(this.data);
                                    this.bitField0_ |= 4;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        case 3560141:
                            if (input.isAtField(ClientDownloadDataOuterClass.ClientDownloadData.FieldNames.time)) {
                                if (!input.trySkipNullValue()) {
                                    this.time = input.readInt64();
                                    this.bitField0_ |= 1;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        case 351608024:
                            if (input.isAtField(ClientDownloadDataOuterClass.ClientDownloadData.FieldNames.version)) {
                                if (!input.trySkipNullValue()) {
                                    this.version = input.readUInt32();
                                    this.bitField0_ |= 2;
                                }
                            } else {
                                input.skipUnknownField();
                            }
                            break;
                        default:
                            input.skipUnknownField();
                    }
                }

                input.endObject();
                return this;
            }
        }

        public ClientDownloadData clone() {
            return (new ClientDownloadData()).copyFrom(this);
        }

        public boolean isEmpty() {
            return this.bitField0_ == 0;
        }

        public static ClientDownloadData parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ClientDownloadData)((ClientDownloadData)ProtoMessage.mergeFrom(new ClientDownloadData(), data)).checkInitialized();
        }

        public static ClientDownloadData parseFrom(ProtoSource input) throws IOException {
            return (ClientDownloadData)((ClientDownloadData)ProtoMessage.mergeFrom(new ClientDownloadData(), input)).checkInitialized();
        }

        public static ClientDownloadData parseFrom(JsonSource input) throws IOException {
            return (ClientDownloadData)((ClientDownloadData)ProtoMessage.mergeFrom(new ClientDownloadData(), input)).checkInitialized();
        }

        public static MessageFactory<ClientDownloadData> getFactory() {
            return ClientDownloadDataOuterClass.ClientDownloadData.ClientDownloadDataFactory.INSTANCE;
        }

        static class FieldNames {
            static final FieldName time = FieldName.forField("time");
            static final FieldName version = FieldName.forField("version");
            static final FieldName data = FieldName.forField("data");

            FieldNames() {
            }
        }

        private static enum ClientDownloadDataFactory implements MessageFactory<ClientDownloadData> {
            INSTANCE;

            private ClientDownloadDataFactory() {
            }

            public ClientDownloadData create() {
                return ClientDownloadDataOuterClass.ClientDownloadData.newInstance();
            }
        }
    }
}
