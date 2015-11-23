package org.bahmni.reports.report;

import org.bahmni.reports.BahmniReportsProperties;
import org.bahmni.reports.model.ObsCannedReportTemplateConfig;
import org.bahmni.reports.model.ObsTemplateConfig;
import org.bahmni.reports.model.Report;
import org.bahmni.reports.template.BaseReportTemplate;
import org.bahmni.reports.template.ObsCannedReportTemplate;
import org.bahmni.reports.template.ObsTemplate;

public class ObsCannedReport extends Report<ObsCannedReportTemplateConfig> {
    @Override
    public BaseReportTemplate getTemplate(BahmniReportsProperties bahmniReportsProperties) {
        return new ObsCannedReportTemplate(bahmniReportsProperties);
    }
}
