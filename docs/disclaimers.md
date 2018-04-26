---
title: Disclaimers and Other Information
permalink: disclaimers/
---

# Disclaimers and Other Information

<p style="color:red;">Liability: PhamCAT assumes no responsibility for any injury to person or
damage to persons or property arising out of, or related to any use of
PharmCAT, or for any errors or omissions. The user recognizes that
PharmCAT is a research tool and that they are using PharmCAT at their
own risk.</p>

### A. Allele and Genotype Determination

1. PharmCAT uses [gene allele definitions from CPIC](https://www.pharmgkb.org/page/pgxGeneRef), with exceptions as noted in [Gene Definition Exceptions document](https://docs.google.com/document/d/1X9Kl5gKLGvQfMY3nYbto0D3R4ZoBrR6mIYQiqMhFSbY/edit?usp=sharing). For allele definitions and the positions used in PharmCAT, see the [gene definition tables](https://github.com/PharmGKB/PharmCAT/releases).
2. PharmCAT results are dependent on the supplied vcf calls for the
    queried positions (for technical information about PharmCAT input
    formatting and requirements, please go to
    [pharmcat.org](http://pharmcat.org/)). PharmCAT does not assume any
    reference calls for positions missing from the submitted vcf; all
    missing queried positions are not considered in the allele
    determination process. See the [gene definition
    tables](https://github.com/PharmGKB/PharmCAT/releases) for more
    information about what positions are queried in the vcf. Missing
    positions might alter the assigned genotype, subsequent phenotype
    prediction and CPIC recommendation. If the supplied vcf is missing
    positions, those positions will be noted in Section 3: Allele Calls
    for each gene of this report. For the most reliable allele
    determination, reference calls as well as variant calls in the vcf
    for every queried position must be provided by the user.
3. For cytochrome P450 genes, TPMT, DPYD, and SLCO1B1, the \*1 (or
    reference in case of DPYD) allele is defined by the absence of
    variation specified in the gene definition tables. This allele
    cannot be identified by variants; rather, \*1 is assigned by default
    when no variation for the queried positions is reported in the
    submitted vcf. It is always possible un-interrogated variation can
    occur which could potentially affect allele function, but because it
    is undetected, the assignment would be defaulted to a \*1 allele and
    normal function.
4. For all genes, variation reported in the vcf but NOT included in the
    gene definition table will not be considered during allele
    assignment. There is a possibility that any such variation results
    in a reduced or no activity allele which could lead to inaccurate
    phenotype and CPIC recommendation, similar to the situation in point
    iii, above.
5.  PharmCAT matches variants to genotypes using unphased data (unless
    phased data is provided in the vcf and noted as such, see
    [pharmcat.org](http://pharmcat.org/) for details). The assumption is
    that defined alleles exist in trans configuration, i.e. on opposite
    chromosomes, with exceptions noted in Section 3: Allele Calls under
    "Gene-specific warnings." However, in cases where an allele is
    defined by a combination of two or more variants, where each variant
    alone also defines an allele, the match is based on the longer
    allele (except for UGT1A1). For example, CYP2C19\*4A is defined one
    SNP, \*17 is defined by another SNP, and \*4B is defined by the
    combination of those two SNPs. In the case of unphased data that is
    heterozygous for both SNPs, the \*1/\*4B genotype is returned though
    the possibility of \*4A/\*17 cannot be ruled out.
6. Nucleotide base calls are displayed on the positive chromosomal
    strand regardless of the gene strand; further information is
    provided under Gene-specific warnings in Section 3: Allele Calls.

### B. CPIC Allele Function, Phenotype and Recommendation

1.  Allele functionality and phenotype terms are based on the [CPIC Term Standardization Project](https://cpicpgx.org/wp-content/uploads/2016/01/CPIC_term_standardization_project_final_terms.pdf) \[PMID: 27441996\]. Please see this reference for details but note the following changes from original CPIC guidelines based on this project:
  1.  This terminology replaces the term 'extensive' metabolizer with
        'normal' metabolizer for drug metabolizing enzymes such as CYPs,
        DPYD, TPMT, UGT1A1. Guidelines published prior to this
        recommendation used the term 'extensive' metabolizer whereas the
        PharmCAT report uses 'normal'.
  2.  The terminology introduces the use of the term 'rapid'
        metabolizer for CYP2C19\*1/\*17 to distinguish between \*1/\*17
        and \*17/\*17 ('ultrarapid' metabolizer). CYP2C19 \*1/\*17 was
        grouped as 'ultrarapid' metabolizer in prior guidelines.
        PharmCAT uses the 'rapid' metabolizer group.
  3.  PharmCAT uses allele functions from [gene information
        tables](https://www.pharmgkb.org/page/pgxGeneRef), including
        alleles with 'possible' or 'likely' added to the function term.
2. PharmCAT uses metabolizer phenotypes from [gene information
    tables](https://www.pharmgkb.org/page/pgxGeneRef). 'Likely' or
    'possible' metabolizer phenotypes are originally based on
    supplemental materials for respective guidelines and are listed in
    the gene "Diplotype-Phenotype Table."
3. PharmCAT uses recommendation wording as provided in the CPIC
    guideline. CPIC typically provides the same recommendations for
    'likely' or 'possible' metabolizer phenotypes in supplemental and
    [gene information tables](https://www.pharmgkb.org/page/pgxGeneRef)
    as those without the 'likely' or 'possible' labels, but do not
    provide a strength of therapeutic recommendation.

### C. CYP2D6 Allele Determination and Metabolizer Status

1.  CYP2D6 genotypes are based on
    [Astrolabe](http://www.childrensmercy.org/Health_Care_Professionals/Research/Pediatric_Genomic_Medicine/Software_Tools/)
    calls. For specific disclaimers and limitations, see the
    [Astrolabe](http://www.childrensmercy.org/Health_Care_Professionals/Research/Pediatric_Genomic_Medicine/Software_Tools/)
    documentation and specifications made available with the product.
2. Metabolizer Status: CPIC classifies genotypes with a gene activity
    score of 1.0 as normal metabolizers; however, other guidelines or
    reference laboratories may classify the same genotypes as
    intermediate metabolizers.

### D. Prescribing Change Designations

1.  The drugs in Section 1: Genotype summary table are colored to
    indicate whether CPIC recommends a prescribing change based on the
    given genotype; highlighting is not based on CPIC classification of
    recommendation.
    1.  [ Red]{.rxChange} indicates a prescribing change is recommended
        for the given genotype. That is, the recommendation is different
        than 'use label recommendation' or 'use recommended starting
        dose', except for ivacaftor.
    2.  [ Orange]{.rxPossibly} indicates possible prescribing changes
        depending on additional information, e.g. pediatrics vs. adult,
        or the specific number of CYP2D6 normal alleles present (copy
        number).
    3.  [ Green]{.normal} indicates that there is no CPIC recommended
        prescribing change for the given genotype, except for ivacaftor.
    4.  [ Blue]{.highlight} indicates the specific guideline must be
        consulted because a CPIC recommended action cannot be provided
        based solely on genotype (eg. warfarin and
        ribavirin/peginterferon).
2. When multiple genotypes are possible for a gene, the drug is
    highlighted according to the highest level of prescribing change.

### E. PharmCAT Exceptions to the CPIC Guideline Gene List

1.  HLA-B and G6PD are currently not included in PharmCAT. Therefore, no
    CPIC guideline recommendations are included for these genes.
2. Further genes will be incorporated into PharmCAT as the tool is
    developed.

### F. PharmCAT Updates

1.  PharmCAT monitors publication of new CPIC guidelines and guideline
    updates. New publication content will be included into PharmCAT
    within one month of CPIC publication.
2. Updates to the gene definition tables may occur, the latest version
    can be found alongside [the software
    releases](https://github.com/PharmGKB/PharmCAT/releases).
3. Updates to PharmCAT may occur, for the latest version go to the
    [PharmCAT release
    page](https://github.com/PharmGKB/PharmCAT/releases).

### G. CPIC Guideline Disclaimers and Caveats

1.  A version of the following quoted disclaimer is part of each CPIC
    guideline and applies to the CPIC recommendations as used in
    PharmCAT. For the full description of potential benefits and risks,
    additional considerations (general and specific to gene-drug pairs),
    limitations, information about respective gene nomenclature systems,
    potential drug-drug interactions and clinical factors to consider,
    please see individual CPIC guidelines
    ([cpicpgx.org](https://cpicpgx.org)).
    1.  "CPIC guidelines reflect expert consensus based on clinical
        evidence and peer-reviewed literature available at the time they
        are written and are intended only to assist clinicians in
        decision making and to identify questions for further research.
        New evidence may have emerged since the time a guideline was
        submitted for publication. Guidelines are limited in scope and
        are not applicable to interventions or diseases not specifically
        identified. Guidelines do not account for all individual
        variations among patients and cannot be considered inclusive of
        all proper methods of care or exclusive of other treatments. It
        remains the responsibility of the health-care provider to
        determine the best course of treatment for a patient. Adherence
        to any guidelines is voluntary, with the ultimate determination
        regarding its application to be made solely by the clinician and
        the patient. CPIC assumes no responsibility for any injury to
        persons or damage to persons or property arising out of or
        related to any use of CPIC's guidelines, or for any errors or
        omissions." (PMID:
        [27997040](https://www.ncbi.nlm.nih.gov/pubmed/27997040))
    2.  "Caveats: appropriate use and/or potential misuse of genetic
        tests. The application of genotype-based dosing is most
        appropriate when initiating therapy with a tricyclic. Obtaining
        a pharmacogenetic test after months of drug therapy may be less
        helpful in some instances, as the drug dose may have already
        been adjusted based on plasma concentrations, response, or side
        effects. Similar to all diagnostic tests, genetic tests are one
        of several pieces of clinical information that should be
        considered before initiating drug therapy." (PMID:
        [27997040](https://www.ncbi.nlm.nih.gov/pubmed/27997040))
2. CPIC guidelines reflect the alleles/genotypes known and considered
    by the guideline authors for inclusion by the time of publication,
    however they may be updated online at
    [cpicpgx.org](https://cpicpgx.org) in between publications.
    Additional alleles and/or more extensive allele definitions might
    exist by the representative gene nomenclatures for various genes.
3. CPIC is a registered service mark of the U.S. Department of Health
    & Human Services (HHS).

### H. PharmGKB Disclaimers and Caveats

1.  PharmGKB is a registered service mark of the U.S. Department of
    Health & Human Services (HHS).