-include= ~${workspace}/cnf/resources/bnd/feature.props
symbolicName=com.ibm.websphere.appserver.beanValidation-3.0
visibility=public
singleton=true
IBM-ShortName: beanValidation-3.0
Subsystem-Name: Bean Validation 3.0
IBM-App-ForceRestart: install, uninstall
IBM-API-Package: \
  jakarta.validation; type="spec", \
  jakarta.validation.bootstrap; type="spec", \
  jakarta.validation.constraints; type="spec", \
  jakarta.validation.constraintvalidation; type="spec", \
  jakarta.validation.executable; type="spec", \
  jakarta.validation.groups; type="spec", \
  jakarta.validation.metadata; type="spec", \
  jakarta.validation.spi; type="spec",\
  jakarta.validation.valueextraction; type="spec",\
  com.ibm.ws.beanvalidation.accessor; type="internal"
-features=\
  com.ibm.websphere.appserver.beanValidationCore-2.0, \
  com.ibm.websphere.appserver.eeCompatible-9.0, \
  com.ibm.websphere.appserver.el-4.0, \
  com.ibm.websphere.appserver.internal.optional.jaxb-2.2; ibm.tolerates:=2.3, \
  com.ibm.websphere.appserver.jakarta.cdi-3.0, \
  com.ibm.websphere.appserver.jakarta.interceptor-2.0, \
  com.ibm.websphere.appserver.jakarta.validation-3.0, \
  com.ibm.websphere.appserver.transaction-2.0
-bundles=\
  com.ibm.ws.beanvalidation.v20.jakarta, \
  com.ibm.ws.org.hibernate.validator.7.0, \
  com.ibm.ws.org.jboss.logging, \
  com.ibm.ws.com.fasterxml.classmate
kind=noship
edition=core
WLP-Activation-Type: parallel
