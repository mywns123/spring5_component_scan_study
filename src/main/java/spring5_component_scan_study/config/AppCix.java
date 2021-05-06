package spring5_component_scan_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_component_scan_study.spring.ChangePasswordService;
import spring5_component_scan_study.spring.MemberDao;
import spring5_component_scan_study.spring.MemberInfoPrinter;
import spring5_component_scan_study.spring.MemberLIstPrinter;
import spring5_component_scan_study.spring.MemberPrinter;
import spring5_component_scan_study.spring.MemberRegisterService;
import spring5_component_scan_study.spring.VersionPrinter;

@Configuration
public class AppCix {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

	@Bean
	public MemberLIstPrinter listPrinter() {
		return new MemberLIstPrinter();
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		return infoPrinter;
	}

	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
	}

	@Bean
	public ChangePasswordService changePwSvc() {
		ChangePasswordService PwSvc = new ChangePasswordService();
		return PwSvc;
	}

}
