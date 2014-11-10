package org.bbop.apollo

/**
 * Created by ndunn on 10/28/14.
 */
enum FeatureStringEnum {
     FEATURES,
     PARENT_ID,
     USERNAME,
     TYPE,
     PARENT_TYPE,
     PROPERTIES,
     TIMEACCESSION,
     TIMELASTMODIFIED,
     RESIDUES,
     CHILDREN,
     CDS("CDS"),
     EXON("Exon"),
     GENE("Gene"),
     PSEUDOGENE("Pseudogene"),
     STOP_CODON_READTHROUGH("StopCodonReadThrough"),
     STOP_CODON_READHTHROUGH_SUFFIX("-stop_codon_read_through"),
     TRANSCRIPT("Transcript"),
     NONCANONICALFIVEPRIMESPLICESITE("NonCanonicalFivePrimeSpliceSite"),
     NONCANONICALTHREEPRIMESPLICESITE("NonCanonicalThreePrimeSpliceSite"),
     DATE_LAST_MODIFIED,
     DATE_CREATION,
     COMMENT("Comment"),
     LOCATION,
     FMIN,
     FMAX,
     IS_FMIN_PARTIAL,
     IS_FMAX_PARTIAL,
     STRAND,
     NAME,
     VALUE,
     CV,
     SEQUENCE,
     DB,
     DBXREFS,
     ACCESSION,
     CDS_SUFFIX("-CDS"),
     MINUS1FRAMESHIFT("Minus1Frameshift"),
     MINUS2FRAMESHIFT("Minus2Frameshift"),
     PLUS1FRAMESHIFT("Plus1Frameshift"),
     PLUS2FRAMESHIFT("Plus2Frameshift"),
     DELETION_PREFIX("Deletion-"),
     INSERTION_PREFIX("Insertion-"),
     OWNER("Owner"),
     ORGANISM,
     SYMBOL,
     DESCRIPTION,
     UNIQUENAME


     String value

     public FeatureStringEnum(String value){
          this.value = value
     }

     public FeatureStringEnum(){
          this.value = name().toLowerCase()
     }

     @Override
     String toString() {
          return value
     }
}