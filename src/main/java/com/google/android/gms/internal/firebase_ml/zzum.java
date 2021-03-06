package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: com.google.firebase:firebase-ml-common@@22.0.1 */
final class zzum {
    static int zza(byte[] bArr, int i, zzup zzup) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zza(b, bArr, i2, zzup);
        }
        zzup.zzbze = b;
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, zzup zzup) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzup.zzbze = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzup.zzbze = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzup.zzbze = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzup.zzbze = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzup.zzbze = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzb(byte[] bArr, int i, zzup zzup) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzup.zzbzf = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & ByteCompanionObject.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & ByteCompanionObject.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        zzup.zzbzf = j2;
        return i3;
    }

    static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static long zzb(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double zzc(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzb(bArr, i));
    }

    static float zzd(byte[] bArr, int i) {
        return Float.intBitsToFloat(zza(bArr, i));
    }

    static int zzc(byte[] bArr, int i, zzup zzup) throws zzwg {
        int zza = zza(bArr, i, zzup);
        int i2 = zzup.zzbze;
        if (i2 < 0) {
            throw zzwg.zzuj();
        } else if (i2 == 0) {
            zzup.zzbzg = "";
            return zza;
        } else {
            zzup.zzbzg = new String(bArr, zza, i2, zzvy.UTF_8);
            return zza + i2;
        }
    }

    static int zzd(byte[] bArr, int i, zzup zzup) throws zzwg {
        int zza = zza(bArr, i, zzup);
        int i2 = zzup.zzbze;
        if (i2 < 0) {
            throw zzwg.zzuj();
        } else if (i2 == 0) {
            zzup.zzbzg = "";
            return zza;
        } else {
            zzup.zzbzg = zzzb.zzh(bArr, zza, i2);
            return zza + i2;
        }
    }

    static int zze(byte[] bArr, int i, zzup zzup) throws zzwg {
        int zza = zza(bArr, i, zzup);
        int i2 = zzup.zzbze;
        if (i2 < 0) {
            throw zzwg.zzuj();
        } else if (i2 > bArr.length - zza) {
            throw zzwg.zzui();
        } else if (i2 == 0) {
            zzup.zzbzg = zzuq.zzbzh;
            return zza;
        } else {
            zzup.zzbzg = zzuq.zzb(bArr, zza, i2);
            return zza + i2;
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zza(com.google.android.gms.internal.firebase_ml.zzya r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.firebase_ml.zzup r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = zza(r8, r7, r0, r10)
            int r8 = r10.zzbze
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zza(r1, r2, r3, r4, r5)
            r6.zzq(r9)
            r10.zzbzg = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.firebase_ml.zzwg r6 = com.google.android.gms.internal.firebase_ml.zzwg.zzui()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzum.zza(com.google.android.gms.internal.firebase_ml.zzya, byte[], int, int, com.google.android.gms.internal.firebase_ml.zzup):int");
    }

    static int zza(zzya zzya, byte[] bArr, int i, int i2, int i3, zzup zzup) throws IOException {
        zzxk zzxk = (zzxk) zzya;
        Object newInstance = zzxk.newInstance();
        int zza = zzxk.zza(newInstance, bArr, i, i2, i3, zzup);
        zzxk.zzq(newInstance);
        zzup.zzbzg = newInstance;
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzwh<?> zzwh, zzup zzup) {
        zzvz zzvz = (zzvz) zzwh;
        int zza = zza(bArr, i2, zzup);
        zzvz.zzdo(zzup.zzbze);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzup);
            if (i != zzup.zzbze) {
                break;
            }
            zza = zza(bArr, zza2, zzup);
            zzvz.zzdo(zzup.zzbze);
        }
        return zza;
    }

    static int zza(byte[] bArr, int i, zzwh<?> zzwh, zzup zzup) throws IOException {
        zzvz zzvz = (zzvz) zzwh;
        int zza = zza(bArr, i, zzup);
        int i2 = zzup.zzbze + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzup);
            zzvz.zzdo(zzup.zzbze);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzwg.zzui();
    }

    static int zza(zzya<?> zzya, int i, byte[] bArr, int i2, int i3, zzwh<?> zzwh, zzup zzup) throws IOException {
        int zza = zza(zzya, bArr, i2, i3, zzup);
        zzwh.add(zzup.zzbzg);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzup);
            if (i != zzup.zzbze) {
                break;
            }
            zza = zza(zzya, bArr, zza2, i3, zzup);
            zzwh.add(zzup.zzbzg);
        }
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzyv zzyv, zzup zzup) throws zzwg {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzup);
                zzyv.zzb(i, Long.valueOf(zzup.zzbzf));
                return zzb;
            } else if (i4 == 1) {
                zzyv.zzb(i, Long.valueOf(zzb(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzup);
                int i5 = zzup.zzbze;
                if (i5 < 0) {
                    throw zzwg.zzuj();
                } else if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzyv.zzb(i, zzuq.zzbzh);
                    } else {
                        zzyv.zzb(i, zzuq.zzb(bArr, zza, i5));
                    }
                    return zza + i5;
                } else {
                    throw zzwg.zzui();
                }
            } else if (i4 == 3) {
                zzyv zzwd = zzyv.zzwd();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzup);
                    int i8 = zzup.zzbze;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zza2;
                        break;
                    }
                    int zza3 = zza(i7, bArr, zza2, i3, zzwd, zzup);
                    i7 = i8;
                    i2 = zza3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzwg.zzum();
                }
                zzyv.zzb(i, zzwd);
                return i2;
            } else if (i4 == 5) {
                zzyv.zzb(i, Integer.valueOf(zza(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzwg.zzuk();
            }
        } else {
            throw zzwg.zzuk();
        }
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzup zzup) throws zzwg {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return zzb(bArr, i2, zzup);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return zza(bArr, i2, zzup) + zzup.zzbze;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = zza(bArr, i2, zzup);
                    i6 = zzup.zzbze;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = zza(i6, bArr, i2, i3, zzup);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzwg.zzum();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzwg.zzuk();
            }
        } else {
            throw zzwg.zzuk();
        }
    }
}
