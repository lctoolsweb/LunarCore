package emu.lunarcore.proto;

import emu.lunarcore.proto.ClientDownloadDataOuterClass.ClientDownloadData;
import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class ClientDownloadDataScNotifyOuterClass {
    public ClientDownloadDataScNotifyOuterClass() {
    }

    public static final class ClientDownloadDataScNotify extends ProtoMessage<ClientDownloadDataScNotify> implements Cloneable {
        private static final long serialVersionUID = 0L;
        private final ClientDownloadDataOuterClass.ClientDownloadData downloadData = ClientDownloadData.newInstance();

        private ClientDownloadDataScNotify() {
        }

        public static ClientDownloadDataScNotify newInstance() {
            return new ClientDownloadDataScNotify();
        }

        public boolean hasDownloadData() {
            return (this.bitField0_ & 1) != 0;
        }

        public ClientDownloadDataScNotify clearDownloadData() {
            this.bitField0_ &= -2;
            this.downloadData.clear();
            return this;
        }

        public ClientDownloadDataOuterClass.ClientDownloadData getDownloadData() {
            return this.downloadData;
        }

        public ClientDownloadDataOuterClass.ClientDownloadData getMutableDownloadData() {
            this.bitField0_ |= 1;
            return this.downloadData;
        }

        public ClientDownloadDataScNotify setDownloadData(ClientDownloadDataOuterClass.ClientDownloadData value) {
            this.bitField0_ |= 1;
            this.downloadData.copyFrom(value);
            return this;
        }

        public ClientDownloadDataScNotify copyFrom(ClientDownloadDataScNotify other) {
            this.cachedSize = other.cachedSize;
            if ((this.bitField0_ | other.bitField0_) != 0) {
                this.bitField0_ = other.bitField0_;
                this.downloadData.copyFrom(other.downloadData);
            }

            return this;
        }

        public ClientDownloadDataScNotify mergeFrom(ClientDownloadDataScNotify other) {
            if (other.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                if (other.hasDownloadData()) {
                    this.getMutableDownloadData().mergeFrom(other.downloadData);
                }

                return this;
            }
        }

        public ClientDownloadDataScNotify clear() {
            if (this.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                this.bitField0_ = 0;
                this.downloadData.clear();
                return this;
            }
        }

        public ClientDownloadDataScNotify clearQuick() {
            if (this.isEmpty()) {
                return this;
            } else {
                this.cachedSize = -1;
                this.bitField0_ = 0;
                this.downloadData.clearQuick();
                return this;
            }
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof ClientDownloadDataScNotify)) {
                return false;
            } else {
                ClientDownloadDataScNotify other = (ClientDownloadDataScNotify)o;
                return this.bitField0_ == other.bitField0_ && (!this.hasDownloadData() || this.downloadData.equals(other.downloadData));
            }
        }

        public void writeTo(ProtoSink output) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                output.writeRawByte((byte)98);
                output.writeMessageNoTag(this.downloadData);
            }

        }

        protected int computeSerializedSize() {
            int size = 0;
            if ((this.bitField0_ & 1) != 0) {
                size += 1 + ProtoSink.computeMessageSizeNoTag(this.downloadData);
            }

            return size;
        }

        public ClientDownloadDataScNotify mergeFrom(ProtoSource input) throws IOException {
            int tag = input.readTag();

            while(true) {
                switch (tag) {
                    case 0:
                        return this;
                    case 98:
                        input.readMessage(this.downloadData);
                        this.bitField0_ |= 1;
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
                output.writeMessage(ClientDownloadDataScNotifyOuterClass.ClientDownloadDataScNotify.FieldNames.downloadData, this.downloadData);
            }

            output.endObject();
        }

        public ClientDownloadDataScNotify mergeFrom(JsonSource input) throws IOException {
            if (!input.beginObject()) {
                return this;
            } else {
                while(!input.isAtEnd()) {
                    switch (input.readFieldHash()) {
                        case 31388929:
                        case 1108584530:
                            if (input.isAtField(ClientDownloadDataScNotifyOuterClass.ClientDownloadDataScNotify.FieldNames.downloadData)) {
                                if (!input.trySkipNullValue()) {
                                    input.readMessage(this.downloadData);
                                    this.bitField0_ |= 1;
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

        public ClientDownloadDataScNotify clone() {
            return (new ClientDownloadDataScNotify()).copyFrom(this);
        }

        public boolean isEmpty() {
            return this.bitField0_ == 0;
        }

        public static ClientDownloadDataScNotify parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ClientDownloadDataScNotify)((ClientDownloadDataScNotify)ProtoMessage.mergeFrom(new ClientDownloadDataScNotify(), data)).checkInitialized();
        }

        public static ClientDownloadDataScNotify parseFrom(ProtoSource input) throws IOException {
            return (ClientDownloadDataScNotify)((ClientDownloadDataScNotify)ProtoMessage.mergeFrom(new ClientDownloadDataScNotify(), input)).checkInitialized();
        }

        public static ClientDownloadDataScNotify parseFrom(JsonSource input) throws IOException {
            return (ClientDownloadDataScNotify)((ClientDownloadDataScNotify)ProtoMessage.mergeFrom(new ClientDownloadDataScNotify(), input)).checkInitialized();
        }

        public static MessageFactory<ClientDownloadDataScNotify> getFactory() {
            return ClientDownloadDataScNotifyOuterClass.ClientDownloadDataScNotify.ClientDownloadDataScNotifyFactory.INSTANCE;
        }

        static class FieldNames {
            static final FieldName downloadData = FieldName.forField("downloadData", "download_data");

            FieldNames() {
            }
        }

        private static enum ClientDownloadDataScNotifyFactory implements MessageFactory<ClientDownloadDataScNotify> {
            INSTANCE;

            private ClientDownloadDataScNotifyFactory() {
            }

            public ClientDownloadDataScNotify create() {
                return ClientDownloadDataScNotifyOuterClass.ClientDownloadDataScNotify.newInstance();
            }
        }
    }
}
