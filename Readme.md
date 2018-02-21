# Logging configuration in spring boot

'''
# Setting logging level of security to DEBUG

logging.level.org.springframework.security= DEBUG

#Logging level of sweb to error
logging.level.org.springframework.web= ERROR

#logging level of hibernate to DEBUG
logging.level.org.hibernate= DEBUG


#Save logs in log file
logging.file = mylogfile.log


#define logging pattern
logging.pattern.console= %d{yyyy-MMM-dd HH:mm:ss.SSS} %-5level [%thread] %logger{15} - %msg%n


# defining application level INFO logging
#logging.level.com.fahimtech.logging=INFO

# define application level Error logging
#logging.level.com.fahimtech.logging=ERROR


# define application level DEBUG logging
logging.level.com.fahimtech.logging=DEBUG

'''