package telemedicine

import admin.*


/**
 * Created on 20.11.2016.
 */
class BootStrap {
    def authenticateService

    def init = { servletContext ->
        def role = new Role(authority: 'ROLE_ADMIN', description: 'Admin role').save()
        def admin = new User(username: 'admin', password: '56rfhg', enabled: true).save()
        UserRole.create(admin, role).save()

    }
    def destroy = {
    }
}